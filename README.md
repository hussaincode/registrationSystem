# Complete registrationSystem project using spring boot and security
1) Technology Used :

              => Spring Boot
              
              => Spring Security
              
              => Java Mail
              
              => Email verification with expiry
              
              => Spring Boot
              
              
 ![Design of the Registration System](https://user-images.githubusercontent.com/19270669/154844747-f67b99e1-21cc-43e3-ae21-7bf3e802c76b.png)
              
         
         
     
     
                           
2) First of all create a project using spring initializer and following dependencies.


![Project dependencies](https://user-images.githubusercontent.com/19270669/154844915-b2d3cb60-66b4-4bbc-a264-cd7463071364.PNG)





3) Lombok, spring web,speing security, spring data JPA, PostgreSQL DDriver and Java Mail Sender

4) Unzip this project and open with Intellij IDEA

5) CREATE 5 packages. 1) appuser 2)email 3)registration 4) token 5) security

6) appuser - all the details we get from user implemented service and repository class

7) email - all the config related to mail sending for the confirmation is in this package

8) registration - the registration of the user logics is in this package



![Registration Endpoint](https://user-images.githubusercontent.com/19270669/154845295-974ac0a8-c18a-4176-a653-8767af8e18b2.PNG)






9) token - generation of the new token every time a new user try to register is done in this package.





![Token Endpoint](https://user-images.githubusercontent.com/19270669/154845300-0ed55c58-ad3d-4528-a05a-34127abaa803.PNG)






10) security - all the security logic like email validation, email already taken is implemented in this package.


11) I have used MailDev in this for email testing.


![MailDev](https://user-images.githubusercontent.com/19270669/154845283-81bb1cd4-97dc-44d3-8837-b0cfc99b529b.PNG)






12) To install Mailev $ npm install -g maildev

13) To run MaailDev $ maildev

14) To run this project please run main method of the registrationSystem class
