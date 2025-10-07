**Questão 4**

Um sistema de pedidos online precisa gerar **relatórios de vendas** em diferentes formatos.
Inicialmente, o relatório contém apenas informações básicas (lista de pedidos).
Posteriormente, o gestor pode decidir adicionar **funcionalidades adicionais**, 
como estatísticas de faturamento, gráficos ou exportação em PDF.
Esses recursos devem ser opcionais e adicionados de forma **flexível, sem alterar o código 
existente do relatório básico**.
Implemente uma solução que permita essa extensão progressiva de funcionalidades.

**Solução:**

para esse problema foi utilizado para adicionar responsabilidades adicionais a
objetos de forma dinâmica, sem que seja necessário alterar sua estrutura o pattern **Decorator**
sendo guiado pelo enunciado do problema.

1° construção da interface e Classe RelatorioDecorator os quais são nos meus termos a configuração principal do 
método.
2° implementação das classes de Relatório Simples, Relatório Com Estatisticas e Exportador PDF.
3° parte do cliente (main) configuração para saida.
