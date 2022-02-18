

# PasswordSaver Backend 
  
Its a Maven based **SpringBoot** backend project for saving credentials for multiple users integrated with **Swagger** , tested with **Junit**. **MongoDB** is used for database.
  
<div id="top"></div>

<!-- TABLE OF CONTENTS -->

## Table of Contents

  <ol>
    <li>
      <a href="#about2">About The Project</a>
      <ul>
        <li><a href="#build3">Structure</a></li>
      </ul>
    </li>
    <li><a href="#usage2">Usage</a></li>
    <li><a href="#contact2">Contact</a></li>
  </ol>



<div id="about2"></div>


<!-- ABOUT THE PROJECT -->

## About The Project

In this project, I created a backend Springboot project for Password saving tool application. It offers all the CRUD operations and return necessary JSON feedback. All the API shown <a href="#usage2">here</a> in swagger integration part. Later, I added unit testing with <b>Junit</b> and <b>Mockito</b>.   

<p align="right">(<a href="#top">back to top</a>)</p>


<div id="build3"></div>

## Structure
  
### Dependency
  Dependecies imported and used for maven -
  * MongoDB
  * Spring Security
  * Spring Web
  * Jsonwebtoken
  * Devtools
  * Swagger2
  * Junit
   
(Details of dependencies and properties can be found on this file - <a href="pom.xml">pom.xml</a>) 

<p align="right">(<a href="#top">back to top</a>)</p>    

<div id="build2"></div>



<div id="usage2"></div>


<!-- USAGE EXAMPLES -->
## Usage
<b>Dropdown</b> to see images of usage. 
<details>
<summary>
	New user register, <b>POST</b> : localhost:8080/api/auth/signup <br>  
	Sample JSON for this request:

	{
		"username": "jawad",
    	"password": "123456"
	}	
</summary>
	<img src="images/signup.png">
</details>

<details>
<summary>
	trying using already registered username will show error message.
</summary>
	<img src="images/signup2.png">
</details>

<details>
<summary>
	User Login, <b>POST</b> : localhost:8080/api/auth/signin <br>
	&nbsp&nbsp&nbsp&nbsp After sucessfull login, it will provide a bearer type <b>accessToken</b>.
</summary>
	<img src="images/signin.png">
</details>

<details>
<summary>
	After login, adding new credential: <b>POST</b> : localhost:8080/api/user/add <br>  
	&nbsp&nbsp&nbsp&nbsp <b>Auth</b> need to setup with accessToken and Sample JSON for this request:

	{
		"websiteUrl":"facebook",
    	"passcode":"4f34fwrf4"
	}
		
</summary>
	<img src="images/add.png">
</details>

<details>
<summary>
	View all credential for a perticular user : <b>GET</b> : localhost:8080/api/user/all <br>  
		
</summary>
	<img src="images/all.png">
</details>

<details>
<summary>
	Updating credential : <b>PUT</b> : localhost:8080/api/user/update <br>  
		
</summary>
	<img src="images/update.png">
</details>

<details>
<summary>
	Deleting credential : <b>DELETE</b> : localhost:8080/api/test/remove <br>  
		
</summary>
</details>

<details>
<summary>
	<b>SWAGGER</b> integration 🔻 
		
</summary>
	<img src="images/swagger.png">
</details>

<details>
<summary>
	<b>mongoDB</b> inner view, using mongoDB compass 🔻 
		
</summary>
	<img src="images/mongodb.png">
</details>


<p align="right">(<a href="#top">back to top</a>)</p>




<div id="usage3"></div>






<div id="contact2"></div>


<!-- CONTACT -->
## Contact

You may contact with me via mail if needed. All necessary contact info are given at - <a href="https://hurutta.github.io"> my website. <a>


<p align="right">(<a href="#top">back to top</a>)</p>


