## Wildlife Tracker

An app for the forest service to track animals for an environmental impact study.

### Description

The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. This application was developed to allow Rangers to track wildlife sightings in the area.

### Setup

To create the necessary databases, launch postgres, then psql, and run the following commands:

* `CREATE DATABASE wildlife_tracker2;`
* `\c wildlife_tracker2;`
* `CREATE TABLE animals (id serial PRIMARY KEY, type varchar, name varchar, health varchar, age varchar);`
* `CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, last_seen timestamp);`
* `CREATE DATABASE wildlife_tracker2_test WITH TEMPLATE wildlife_tracker2;`

### Code Edits Made

* `In build.gradle there was a bad file name (archivesBaseName = "java_wilderness-tracker") changed to "java-wildlife-tracker";`
* `In endangered animal details, the id and name were displaying, but not the health or age until a sighting was added;`
* `Small copy error fixed and title given more distinction on animal.vtl: “ID: >$sighting.getId()” changed to  “Sighting ID: $sighting.getId()”;`
* `Copy edit on index.vtl: changed the All Animals list to Non-Endangered Specifically;`
* `AnimalTest.java: test name changed to “animal_instantiatesCorrectly_true” to reflect true value;`
* `AnimalTest.java: test name changed to “equals_returnsTrueIfNameIsTheSame” to reflect assertTrue method;`
* `Added line breaks and extended the strong tags on both the animal.vtl and the endangered_animal.vtl to make the logs more readable and distinct from each other;`
* `EndangeredAnimalTest.java: test name changed to “save_assignsIdAndSavesObjectToDatabase_true” to reflect assertEquals method;`
* `Added missing tests to EndangeredAnimalTest.java;`
* `AnimalTest.java: test name changed to “all_returnsAllInstancesOfAnimal_true” to reflect assertEquals method;`
* `Removed id in both animal and endangeredAnimal constructors;`
* `Added extends to EndangeredAnimal member variables to make EndangeredAnimal a child class of Animal;`
* `Added necessary code to  transform EndangeredAnimal into child object of parent class Animal;`
* `Consolidated the endangered_animals table into animals table;`
* `Added front end and back end code as well as amending the sightings table to add timestamp to sightings log;`
* `Removed unnecessary code for update and delete functions;`
* `Added font color css;`

### License

Copyright (c) 2017 **_MIT License_**
