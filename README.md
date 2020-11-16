# spring-boot-hexagonal-architecture-archetype
The aim of this project is to provide an archetype to simply set up a new spring boot project using a hexagonal architecture template.

To do that, simply clone this git project :
```
git clone https://github.com/FrancisChDour/spring-boot-hexagonal-architecture-archetype.git
```
Go to the root directory of the project and launch a maven clean install job.
```
cd spring-boot-hexagonal-architecture-archetype
mvn clean install
```
Now if you go to the place you want to set up your new maven project, use the following command to open the classic maven from archetype generator prompt. The archetypeCatalog parameter permits to only look locally hosted archetypes.
```
mvn archetype:generate -DarchetypeCatalog=local
```
Here you can choose many properties like your groupId and ArtifactId to automaticly build your project structure. I invite you to not edit the default properties. They are generated to fit with the architecture.
```
Choose archetype:
1: local -> com.decathlon.archetype:spring-boot-hexagonal-architecture (spring-boot-hexagonal-architecture)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 1
Define value for property 'groupId': com.sample
Define value for property 'artifactId': test
Define value for property 'version' 1.0-SNAPSHOT: : 
Define value for property 'package' com.sample.test: : 
Define value for property 'parent-artifactId' test: : 
Define value for property 'parent-groupId' com.sample: : 
Confirm properties configuration:
groupId: com.sample
artifactId: test
version: 1.0-SNAPSHOT
package: com.sample.test
parent-artifactId: test
parent-groupId: com.sample
```
After validating, the new project in created with the following structure :
```
$ tree test
test
├── application
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── sample
│                       └── test
│                           └── application
│                               ├── Application.java
│                               └── controller
│                                   └── ItemController.java
├── domain
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── sample
│                       └── test
│                           └── domain
│                               ├── item
│                               │   ├── Item.java
│                               │   ├── ItemNotFoundException.java
│                               │   ├── ItemRepository.java
│                               │   ├── ItemService.java
│                               │   └── ItemServiceImpl.java
│                               └── tools
│                                   ├── DomainException.java
│                                   ├── ErrorMessage.java
│                                   └── NotFoundException.java
├── infrastructure
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── sample
│                       └── test
│                           └── architecture
│                               ├── ItemRepositoryImpl.java
│                               └── ItemRepositoryImplMock.java
└── pom.xml
```
You can now perform a maven clean install into this project to generate the Jar of the application. It can be launch as a spring boot application.