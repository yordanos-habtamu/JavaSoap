# Java Soap Api Demonstration

## Overview
This project is a Java-based web service that utilizes Soap.

## Project Structure
```
my-java-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven

### Installation
1. Clone the repository:
   ```
   git clone github.com/yordanos-habtamu/JavaSoap.git
   ```
2. Navigate to the project directory:
   ```
   cd JavSoap
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```

### Configuration
- Configure the application properties in the `src/main/resources` directory as needed.

### Running the Application
To run the application, execute the following command:
```
mvn exec:java -Dexec.mainClass="com.example.App"
```
### Running the Soap Client
To run the Soap Client, execute the following command:
```
mvn exec:java -Dexec.mainClass="com.example.soap.SoapClient"
```
### Testing
To run the unit tests, use:
```
mvn test
```

## Usage

- For SOAP services, refer to the WSDL located at `http://localhost:7000/ws`.

## Screenshots
(Include screenshots demonstrating successful deployment and testing of the endpoints here.)
![image](https://github.com/user-attachments/assets/429f996a-f638-4a47-912a-c4ff4eeaaebb)


## Contributing
Feel free to submit issues or pull requests for improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

