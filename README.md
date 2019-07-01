# Books library with CRUD operations to disk file through a Command Line Interface CLI
Simple application that maintains a database of books stored in text files. The user, through a command line interface, able to view, add, edit and delete book entries. In addition, a search function to allow the user to filter books by keyword.

## Table of contents
* [Architecture](#architecture)
* [Technologies](#technologies)
* [Getting Started](#getting-started)
* [About me](#about-me)
* [Acknowledgments](#acknowledgments)

## Architecture
The project follows the MVC architectural style. 

## Technologies
This project is created using **Java native code**:

1. Java 8
2. Maven Dependency Management	

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
You need to install the following software:
 * Java JDK 1.8+
 * Maven 3.0+
 * Git client

### Developing Steps
The developing steps for this project:
	
**Step 1.** Create a *Java Maven* project.

**Step 2.** Add well-naming *packages*.

**Step 3.** Add a *FileConnection* Class that create file *books.text* at the current user home directory if it is not exist or return it if it exists.

**Step 4.** Create a domain class *Book*.

**Step 5.** Create a *BookService* interface and *BookServiceImpl* class for Book operations.

**Step 6.** Create a *ViewerService* interface and *ViewerServiceImpl* class for CLI functions.

**Step 7.** Create a *BookController* class for routing and navigation between different book manager options.

**Step 8.** Test and debug every functions. 
 
### Setup
To run this project, install it locally as follow:

1. **Clone the project or download it from github**

	```bash
	git clone https://github.com/SayedBaladoh/File-CRUD-operations-using-Java-CLI-Command-Line-Interface.git
	```

2. **Compile into a jar**

	Run maven command *clean install*, and This command will create an executable *.jar* file into the *target* directory.

	```bash
	cd project_directory
	mvn clean install
	```	

3. **Run the jar**

	In the command line go to your executable jar into the *target* directory. Then execute the following command:
	
	```bash
	cd project_directory
	java -jar target/books-cli-0.1.0.jar
	```
	
## Running the CLI exemples

The following is a sample of the **first** session of the application may look like:

```bash
java -jar .\books-cli-0.1.0.jar
There aren't any books available to load.

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 1

===== View Books =====

        There aren't any books available.

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 2

===== Add a Book =====

Please enter the following information:

        Title: Java Basics
        Author: Mohammad Ahmed
        Description: Basics of Java

Book [1] Saved

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 2

===== Add a Book =====

Please enter the following information:

        Title: Java 2 EE
        Author: Ahmed Ali
        Description: Basics Java for Web

Book [2] Saved

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 2

===== Add a Book =====

Please enter the following information:

        Title: Advanced JavaScript
        Author: Ahmed Mohammad
        Description: Advanced Course

Book [3] Saved

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 1

===== View Books =====

        [1] Java Basics
        [2] Java 2 EE
        [3] Advanced JavaScript

To view details enter the book ID, to return press <Enter>.

Book ID: xyz
        Please enter correct book id; to return press <Enter>.

Book ID: 25
        There is no book with ID [25] in the listed books.

To view details enter the book ID, to return press <Enter>.

Book ID: 1

        ID: 1
        Title: Java Basics
        Author: Mohammad Ahmed
        Description: Basics of Java

To view details enter the book ID, to return press <Enter>.

Book ID: 3

        ID: 3
        Title: Advanced JavaScript
        Author: Ahmed Mohammad
        Description: Advanced Course

To view details enter the book ID, to return press <Enter>.

Book ID: 2

        ID: 2
        Title: Java 2 EE
        Author: Ahmed Ali
        Description: Basics Java for Web

To view details enter the book ID, to return press <Enter>.

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 3

===== Edit a Book =====

        [1] Java Basics
        [2] Java 2 EE
        [3] Advanced JavaScript

Enter the book ID of the book you want to edit; to return press <Enter>.

Book ID: 2

Input the following information. To leave a field unchanged, hit <Enter>.

        Title: [Java 2 EE]: java 2 Enterprise Edition
        Author: [Ahmed Ali]:
        Description: [Basics Java for Web]: java2EE tutorial

Book [2] Updated

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 5

===== Search by title =====

Type in one or more keywords to search for.

        Search: java

The following books matched your query. Enter the book ID to see more details, or <Enter> to return.

        [1] Java Basics
        [2] java 2 Enterprise Edition
        [3] Advanced JavaScript

Book ID: 5
        There aren't any books with ID [5] in the matched books.

Book ID: test
        Please enter correct book id; to return press <Enter>.

Book ID: 2

        ID: 2
        Title: java 2 Enterprise Edition
        Author: Ahmed Ali
        Description: java2EE tutorial

Book ID: 3

        ID: 3
        Title: Advanced JavaScript
        Author: Ahmed Mohammad
        Description: Advanced Course

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 6

===== Search by description =====

Type in one or more keywords to search for.

        Search:  java

The following books matched your query. Enter the book ID to see more details, or <Enter> to return.

        [1] Java Basics

Book ID: 1

        ID: 1
        Title: Java Basics
        Author: Mohammad Ahmed
        Description: Basics of Java

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 7

===== Search by title or description =====

Type in one or more keywords to search for.

        Search: advanced

The following books matched your query. Enter the book ID to see more details, or <Enter> to return.

        [3] Advanced JavaScript

Book ID: 3

        ID: 3
        Title: Advanced JavaScript
        Author: Ahmed Mohammad
        Description: Advanced Course

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 2

===== Add a Book =====

Please enter the following information:

        Title: Web programming
        Author: Sayed Mohammad
        Description: Basics of web (Java, java Script, Html)

Book [4] Saved

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 7

===== Search by title or description =====

Type in one or more keywords to search for.

        Search: java

The following books matched your query. Enter the book ID to see more details, or <Enter> to return.

        [1] Java Basics
        [2] java 2 Enterprise Edition
        [3] Advanced JavaScript
        [4] Web programming

Book ID: 4

        ID: 4
        Title: Web programming
        Author: Sayed Mohammad
        Description: Basics of web (Java, java Script, Html)

Book ID: 1

        ID: 1
        Title: Java Basics
        Author: Mohammad Ahmed
        Description: Basics of Java

Book ID: 4

        ID: 4
        Title: Web programming
        Author: Sayed Mohammad
        Description: Basics of web (Java, java Script, Html)

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 4

===== Remove a Book =====
        [1] Java Basics
        [2] java 2 Enterprise Edition
        [3] Advanced JavaScript
        [4] Web programming

Enter the book ID of the book you want to remove; to return press <Enter>.

Book ID: abc
        Please enter correct book id; to return press <Enter>.

Book ID: 2
        Are you sure you want to remove Book [id=2, title=java 2 Enterprise Edition, author=Ahmed Ali, description=java2EE tutorial]?
        Enter y for confirmation; to return press <Enter>:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 4

===== Remove a Book =====
        [1] Java Basics
        [2] java 2 Enterprise Edition
        [3] Advanced JavaScript
        [4] Web programming

Enter the book ID of the book you want to remove; to return press <Enter>.

Book ID: 2
        Are you sure you want to remove Book [id=2, title=java 2 Enterprise Edition, author=Ahmed Ali, description=java2EE tutorial]?
        Enter y for confirmation; to return press <Enter>: y

Book [2] Deleted

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 1

===== View Books =====

        [1] Java Basics
        [3] Advanced JavaScript
        [4] Web programming

To view details enter the book ID, to return press <Enter>.

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 8

Library saved.
```

The following is a sample of the *second* session of the application may look like:

```bash
java -jar .\books-cli-0.1.0.jar
Loaded [3] books into the library.

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 1

===== View Books =====

        [1] Java Basics
        [3] Advanced JavaScript
        [4] Web programming

To view details enter the book ID, to return press <Enter>.

Book ID:

===== Book Manager =====

        1) View all books
        2) Add a book
        3) Edit a book
        4) Remove a book
        5) Search for a book by title
        6) Search for a book by description
        7) Search for a book by title and description
        8) Save and exit
        9) Exit without save

Choose [1-9]: 9
```
## About me

I am Sayed Baladoh - Phd. Senior Software Engineer. I like software development. You can contact me via:

* [LinkedIn+](https://www.linkedin.com/in/sayed-baladoh-227aa66b/)
* [Mail](mailto:sayedbaladoh@yahoo.com)
* [Phone +20 1004337924](tel:+201004337924)

_**Any improvement or comment about the project is always welcome! As well as others shared their code publicly I want to share mine! Thanks!**_

## Acknowledgments

Thanks for reading. 
Did I help you?

+ Share it with someone you think it might be helpful.
+ Give a star to this project
