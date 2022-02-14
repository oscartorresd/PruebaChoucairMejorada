#Autor: Oscar Torres
@stories
Feature: Reto Choucair
  As an automator I am going to enter the utest page to fill out the form and create a new user
  @scenario1
  Scenario: Create a new user in utest
    Given that oscar needs a new user to enter utest
    When you go to utest.com and click on join today you will find the form to create a new user
      | strName | strLastName | strEmail              | strBirthMonth | strbirthDay | strbirthYear | strLanguage | strCity | strZip | strCountry | strComputer | strVersionComputer | strLanguageComputer | strMobileDevice | strModelDevice | strOsDevice | strPassword |
      | Oscar   | Torres      | oscartorresdyahoo.com | April         | 08          | 1991         | English     | Bogota  | 111141 | Colombia   | Windows     | 10                 | English             | Apple           | iPhone 8       | iOS 14      | 123*Oscar   |
    Then he fills out the form and obtains the new user to enter utest
      | strEndText     |
      | Complete Setup |