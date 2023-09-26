Feature: seleccionar un producto en el sitio web

  Scenario: Crear un producto y filtarlo en la lista
    Given Que el usuario esta en el sitio web
    When EL usuario se dirige a crear un producto
    Then podra ver el producto y pudo filtrarlo exitosamente