**Questão 3**
Um site de notícias deseja implementar um recurso onde os leitores podem 
**se inscrever em determinados tópicos** (política, esportes, tecnologia).
Sempre que uma nova notícia for publicada em um tópico, todos os leitores interessados
devem receber uma **notificação automática.**
Implemente uma solução que suporte múltiplos tópicos e múltiplos leitores,
sem exigir que o site mantenha manualmente o controle de quem deve ser notificado.



*Solução:*

Para esse exercicio foi utilizado o pattern (**Observer**) pois o mesmo tem a capacidade
de criar uma relação de dependência **um-para-muitos** entre objetos,
de modo que quando um objeto muda de estado,
todos os seus observadores são **notificados** e atualizados automaticamente.