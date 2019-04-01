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

  @sinDisponibles
  Scenario Outline: Loguearse con clientes válidos por cuit sin disponible
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario logueado con margenes sin disponibles.

    Examples:
      | cuit |
      | 30507255201 |

  @sinAcuerdo
  Scenario Outline: Loguearse con clientes válidos por cuit sin acuerdos vigentes para sola firma
    When El usuario ingresa "<cuit>"
    And Hace click en Enviar
    Then Se muestra el Onboarding del usuario logueado sin margenes .

    Examples:
      | cuit |
      | 20077212397 |

#  @Login
#  Scenario Outline: Loguearse con un usuario valido
#    When El usuario ingresa "<user>" y password "<pass>"
#    And  Hace click en aceptar
#    Then Se muestra el Onboarding del usuario logueado.
#
#    Examples:
#    | user | pass | status |
#    | santi | manda | success |
#    | mex   | gato  | success |


#  @tag2
#  Scenario: Loguearse con un usuario valido
#    When El usuario navega a la pagina de login
#    And El usuario ingresa usuario y password
#    Then Se muestra el Onboarding del usuario logueado 2.
