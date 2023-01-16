Feature: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items
  @test
  Scenario: Loguearse

    Given que me encuentro en el login de la apk Swags Labs
    When me logueo con las credenciales de usuario: "problem_user" y contraseña: "secret_sauce"
    Then valido que debe aparecer el título de "PRODUCTS"
    And también valido que exista al menos un item