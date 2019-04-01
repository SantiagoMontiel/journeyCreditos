#language es.
#Author: ssosa@baufest.com
#Keywords Summary : Crédito empresas
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@login @slow
Feature: Login
  Verificar que el usuario se puede loguear correctamente en el sitio

  Background:
    Given El usuario se encuentra en la pagina de ingreso de cuit

  @conMargenes
  Scenario Outline: Loguearse con clientes válidos por cuit
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario logueado.

    Examples:
      | cuit |
      | 30500089624 |
