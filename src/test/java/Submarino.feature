#language:pt
@submarino
Funcionalidade: Como usuário do site Submarino
  Eu desejo realizar uma compra online

  @test01
  Cenario: Validar compra online no site Submarino
    Dado que eu acesso o site Submarino
    E realizo uma busca pelo produto "Violão"
    E clico em buscar
    E acesso a página dos "resultados para “violão”"
    E clico no produto
    E acesso a página do produto
    E preecho o campo "CEP", clico em "OK"
    E clico em adicionar quantidade
    E clico em subtrair quantidade
    E preencho os dados do endereço de entrega "CEP", "número", "ponto de referência", "nome completo"
    E clico em salvar endereço
    E preencho número do "cartão de credito", "nome completo", "validade", "código de segurança"
    E clico em "fechar pedido"
