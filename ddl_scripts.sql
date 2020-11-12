SELECT CONCAT('ALTER TABLE ', TABLE_NAME, ' CHANGE `', COLUMN_NAME, '` `',
LOWER(REPLACE(COLUMN_NAME,'__','_')), '` ', COLUMN_TYPE, ';') AS DDL
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona' 
and TABLE_NAME like 'val_sphs%' 
and COLUMN_TYPE NOT IN ('date','datetime','timestamp')
and COLUMN_NAME like '%instanceid%'


SELECT TABLE_NAME,COLUMN_TYPE,COLUMN_TYPE AS DDL
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona'
and COLUMN_NAME like '%lon%'
and TABLE_NAME like 'dataval_pp%' 


SELECT CONCAT('ALTER TABLE ', TABLE_NAME, ' MODIFY COLUMN `', COLUMN_NAME, '` time;') AS DDL
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona'
and COLUMN_TYPE IN ('timestamp')
and COLUMN_NAME like '%harvest%'
and TABLE_NAME like 'val_sphs%' 


SELECT DISTINCT CONCAT('ALTER TABLE ', TABLE_NAME, ' ADD COLUMN `id` bigint NOT NULL AUTO_INCREMENT FIRST,ADD PRIMARY KEY (`id`);') AS anyAliasName
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona' and TABLE_NAME like 'dataval_sphs_harvest_con_tri'

SELECT DISTINCT CONCAT('ALTER TABLE ', TABLE_NAME, ' MODIFY COLUMN `id` bigint(20) NOT NULL AUTO_INCREMENT FIRST;') AS anyAliasName
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona' and TABLE_NAME like 'pra_sphs%'

SELECT DISTINCT CONCAT('ALTER TABLE ', TABLE_NAME, ' DROP COLUMN `id`;') AS anyAliasName
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona' and TABLE_NAME like 'pra_sphs%'

-- ALTER TABLE `ona`.`pra_sphs` ADD UNIQUE INDEX `controk_key_uk`(`control_key`);

SELECT DISTINCT CONCAT('ALTER TABLE ', TABLE_NAME, ' ADD UNIQUE INDEX `controk_key_uk`(`control_key`);') AS ADD_INDEX
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona'

SELECT DISTINCT CONCAT('ALTER TABLE ', TABLE_NAME, ' DROP INDEX IF EXISTS `controk_key_uk`;') AS ADD_INDEX
FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA ='ona'


SELECT DISTINCT(CONCAT('DELETE FROM ', TABLE_NAME, ';')) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'ona'
