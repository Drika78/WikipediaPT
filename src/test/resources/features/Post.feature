
  #Funcionalidade: Consulta
    #Cenario: Consultar Ovo de Pascoa
      #Dado que acesso a Wikipedia em Portugues
      #Quando pesquiso por "Ovo De Páscoa"
      #Entao exibe a expressao "Ovo De Páscoa" no titulo da guia


Feature: : Consulta
  Scenario: Consultar Ovo de Pascoa
    Given que acesso a Wikipedia em Portugues
    When pesquiso por "Ovo De Páscoa"
    Then exibe a expressao "Ovo De Páscoa" no titulo da guia