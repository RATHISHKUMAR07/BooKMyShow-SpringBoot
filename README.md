# BookMyShow App

This README provides information about the Movie API endpoints for the BookMyShow application.

## Table of Contents

- [About](#about)
- [Technologies Used](#technologies-used)
- [Feature](#features)
- [API Endpoints](#api-endpoints)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About

This project focuses on performing various operations in a database, such as creating, reading, updating, and deleting data. It provides a platform to interact with the database and manage its contents programmatically.

## Technologies Used

- Spring Boot
- PostgreSQL
- Swagger
- Java

## Features

List the key features of your project. For example:
- Create new records in the database
- Retrieve data based on specific criteria
- Update existing records
- Delete records from the database

## API Endpoints

Below are the available API endpoints for managing movie information:

<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/Database.JPG">

- **GET /BookMyShow/movies**: Retrieve a list of all movies.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/getAll.JPG">

- **GET /BookMyShow/movies/{id}**: Retrieve information about a specific movie.
  
<mg src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/getId.JPG">

- **PUT /BookMyShow/movies/{id}**: Update information for a specific movie.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/update.JPG">

- **DELETE /BookMyShow/movies/{id}**: Delete a specific movie.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/delete.JPG">

- **POST /BookMyShow/movies**: Add a new movie.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/addMovie.JPG">

- **GET /BookMyShow/movies/rating/{rating}**: Retrieve movies based on a specific rating.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/rating.JPG">

- **GET /BookMyShow/movies/genre/{genre}**: Retrieve movies of a specific genre.
  
- <img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/genre.JPG">

- **GET /BookMyShow/movies/cost/{cost}**: Retrieve movies based on a specific cost.
  
<img src="https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot/blob/springboot/BookMyShowApp/Output/cost.JPG">

  
## Getting Started

Follow these steps to set up and run the project locally.

### Prerequisites

- Java JDK
- PostgreSQL Database
- Spring Tool Suite

### Installation

1. Clone the repository: `git clone https://github.com/RATHISHKUMAR07/BooKMyShow-SpringBoot`
2. Configure the database connection in `application.properties`.
3. Build the project using your preferred build tool.
4. Run the application.

## Usage

Explain how to use the API endpoints to interact with movie data. You can explore and interact with the API documentation using Swagger UI.

## Contributing

Contribute to the project by following these guidelines for bug reports, feature requests, and pull requests.

## License

Specify the license under which your project is released.

## Contact

Provide a way for users to contact you if they have questions or feedback <a href="https://www.linkedin.com/in/rathishkumar-m/">LinkedIn</a>.

