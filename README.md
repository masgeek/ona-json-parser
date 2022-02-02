# ONA JSON Parser

This utility allows the processing of JSON files downloaded via ONA REST api in CSV based on a set format.

## Installation

1. Make sure you have JDK8 or higher installed
2. You will need to define the following locations
   1. Source path of the json files using the environmental variable **JSON_PATH** e.g ```D:\\ona\\json\\```
   2. Output of the CSV files using the environmental variable **OUTPUT_PATH** e.g ```D:\\ona\csv\\```
   3. Path for validating the CSV files against previously downloaded data(Optional) files using the environmental variable **COMPARE_PATH** e.g ```D:\\ona\\csv_ref\\```

## Processing the data

After defining the above you can now run the JAR file, you can get the latest version m the releases folder or you can build directly from the source code.

### Build from source code

1. Clone the repository
   1. Build the source using *gradle* command ```./gradlew release```
   2. check the dist folder for the files
   3. Update parameters for the ```.env``` file
   4. Execute the following command: ```./java-downloader.sh```

Check your output path for the generated CSV files.

By default, the utility uses a build in database