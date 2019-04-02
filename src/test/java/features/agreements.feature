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

@cliente @pymes @representanteLegal @solaFirma
Feature: Agreements
  Verificar para distintos clientes los acuerdos disponibles

  Background:
    Given El usuario se encuentra en la pagina de ingreso de cuit

  @conMargenes
  Scenario Outline: Login con cliente con acuerdo vigente
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario con acuerdo vigente

    Examples:
    | cuit |
    | 30500089624 |

  @sinDisponibles
  Scenario Outline: Login con cliente con acuerdo vigente sin margenes disponibles
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario con acuerdo vigente sin margen disponible

    Examples:
      | cuit |
      | 30507255201 |

  @sinAcuerdo
  Scenario Outline: Login con cliente sin acuerdo vigente
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario sin acuerdo vigente

    Examples:
      | cuit |
      | 20077212397 |
