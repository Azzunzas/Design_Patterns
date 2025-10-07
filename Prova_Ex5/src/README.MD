**Questão 5**

Uma empresa de design oferece modelos de documentos 
(currículos, propostas comerciais, relatórios).
Cada modelo pode ser personalizado para um cliente específico 
(mudança de cores, fontes e logotipo).
O sistema deve permitir que, a partir de um modelo existente, 
seja possível **gerar rapidamente uma nova cópia personalizável**, 
sem precisar recriar toda a estrutura do documento do zero.
Implemente uma solução que atenda a esse requisito.


**Solução:**

Para a realização desse exercicio foi utilizado o Pattern (Prototype) devido a sua 
caracteristica de poder gerar clones de um objeto base.

1° passo implementação da interface
2° passo criação da classe curriculo, PropostaComercial e Relatorio
3° configiração Main (cliente) passagem dos novos parametros(cópia) e saida das info.