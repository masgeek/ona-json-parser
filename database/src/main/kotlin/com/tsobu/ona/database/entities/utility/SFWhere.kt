package com.tsobu.ona.database.entities.utility

import org.springframework.data.jpa.domain.Specification
import java.util.*
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Transient
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

/**
 * Jpa动态条件生成类
 *
 * @author 刘前进 xindong888@163.com  www.xjke.com
 * @since 1.0.0
 */
object SFWhere {
    /**
     * 条件之间用和(and)链接
     *
     * @param entity 实体对象
     * @param <T>    实体对象的类型
     * @return 返回自身
    </T> */
    fun <T : Any> and(entity: T): SFClass<T> {
        return SFClass(entity, "and")
    }

    /**
     * 条件之间用和(or)链接
     *
     * @param entity 实体对象
     * @param <T>    实体对象的类型
     * @return 返回自身
    </T> */
    fun <T : Any> or(entity: T): SFClass<T> {
        return SFClass(entity, "or")
    }

    /**
     * 内嵌式条件包装类
     *
     * @param <T> 实体对象的类型
    </T> */
    class SFClass<T : Any>(private var entity: T, private val andOr: String) {
        private val sMap: MutableMap<String, Specification<T>> = HashMap()
        /**
         * 通过字段上的注解过滤掉字段,加入了这些注解的字段是无法成为条件的
         *
         * @param annotation 注解
         * @return 真假
         */
        private fun judgeAnnotation(annotation: Annotation): Boolean {
            return annotation.annotationClass == OneToOne::class.java || annotation.annotationClass == OneToMany::class.java || annotation.annotationClass == ManyToOne::class.java || annotation.annotationClass == ManyToOne::class.java || annotation.annotationClass == Transient::class.java
        }

        /**
         * 编译条件
         *
         * @return 返回编译后的条件
         */
        fun build(): Specification<T> { //构建一个条件实例
//            return (label@ Specification { root: Root<T>?, query: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
//                //建立一个条件容器
//                val predicateList: MutableList<Predicate?> = ArrayList()
//                //取出条件
//                sMap.forEach { (fieldName: String?, sp: Specification<T>) -> predicateList.add(sp.toPredicate(root!!, query!!, criteriaBuilder)) }
//                //建立一个数组容器
////                val predicates = arrayOfNulls<Predicate>(predicateList.size)
//                //链接条件
//                if (andOr == "and") {
//                    return@label criteriaBuilder.and(*predicateList.toTypedArray())
//                } else {
//                    return@label criteriaBuilder.or(*predicateList.toTypedArray())
//                }
//            })
            return Specification<T> { root, query, criteriaBuilder ->
                val predicateList = mutableListOf<Predicate?>()
                sMap.forEach {
                    predicateList.add(it.value.toPredicate(root, query, criteriaBuilder))
                }
                if (andOr == "and") {
                    return@Specification criteriaBuilder.and(*predicateList.toTypedArray())
                } else if (andOr == "or") {
                    return@Specification criteriaBuilder.or(*predicateList.toTypedArray())
                }
                null
            }
        }

        /**
         * 生成等于条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值
         * @return 返回自身
         */
        fun equal(condition: Boolean, property: String, value: Any?): SFClass<T> {
            sMap[property] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.equal(root.get<Any>(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 模糊查询
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是字符串的类型的,全模糊是 "%" + 值 + "%"
         * @return 返回自身
         */
        fun like(condition: Boolean, property: String, value: String?): SFClass<T> {
            sMap[property] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.like(root.get(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 大于条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是数值型的
         * @return 返回自身
         */
        fun gt(condition: Boolean, property: String, value: Number?): SFClass<T> {
            sMap[property] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.gt(root.get(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        fun gt(property: String): SFClass<T> {
            sMap[property] = Specification { _: Root<T>?, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder -> criteriaBuilder.and() } as Specification<T>
            return this
        }

        /**
         * 大于等于条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是数值型的
         * @return 返回自身
         */
        fun ge(condition: Boolean, property: String, value: Number?): SFClass<T> {
            sMap[property] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.ge(root.get(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 小于条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是数值型的
         * @return 返回自身
         */
        fun lt(condition: Boolean, property: String, value: Number?): SFClass<T> {
            sMap[property] =  Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.lt(root.get(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 小于等于条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是数值型的
         * @return 返回自身
         */
        fun le(condition: Boolean, property: String, value: Number?): SFClass<T> {
            sMap[property] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.le(root.get(property), value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 包含条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param value     生成的条件值,必须是集合
         * @return 返回自身
         */
        fun <Y> `in`(condition: Boolean, property: String, value: List<Y?>?): SFClass<T> {
            sMap[property] =  Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    val objectPath = root.get<Any>(property)
                    return@Specification objectPath.`in`(value)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 范围条件
         *
         * @param condition 条件
         * @param property  属性名称(字段名称),必须是实体类的属性名称
         * @param start     范围的开始值
         * @param end       范围的结束值
         * @return 返回自身
         */
        fun <Y : Comparable<Y>?> between(condition: Boolean, property: String, start: Y, end: Y): SFClass<T> {
            sMap[property] =  Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder ->
                if (condition) {
                    return@Specification criteriaBuilder.between(root[property], start, end)
                }
                criteriaBuilder.and()
            } as Specification<T>
            return this
        }

        /**
         * 条件包装类的构造函数
         */
        init {
            //反射循环出该实体对象的所有字段
            for (declaredField in this.entity::class.java.declaredFields) {
                try { //设置是否允许获取字段的值
                    declaredField.isAccessible = true
                    val value = declaredField[entity]
                    //获取字段的名称
                    val fieldName = declaredField.name
                    var tmp = false
                    //过滤字段上的注解
                    for (annotation in declaredField.annotations) {
                        if (judgeAnnotation(annotation)) {
                            tmp = true
                            break
                        }
                    }
                    //字段注解及值,都允许的情况下才包装条件
                    if (!tmp && value != null) {
                        sMap[fieldName] = Specification { root: Root<T>, _: CriteriaQuery<*>?, criteriaBuilder: CriteriaBuilder -> criteriaBuilder.equal(root.get<Any>(fieldName), value) } as Specification<T>
                    }
                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                }
            }
        }
    }
}