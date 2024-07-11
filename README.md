## WriteCode - Cardápio Online

Este projeto foi desenvolvido durante o Programa de Residência em TIC 12, com o objetivo de solucionar os problemas de um restaurante em relação aos pedidos realizados pelos clientes. O restaurante estava enfrentando diversos desafios, como a falta de ordem nos pedidos, a demora no atendimento e a presença de erros nas solicitações.

Para solucionar esses problemas, desenvolvi um aplicativo Android que funciona como um cardápio online, permitindo que os clientes façam seus pedidos de forma rápida e eficiente, diretamente de suas mesas.

### Funcionalidades do Aplicativo

- **Cardápio Online:** O aplicativo exibe um cardápio completo, dividido em categorias: entradas, pratos principais, bebidas e sobremesas. Cada item possui informações detalhadas como o tempo médio de preparo e o preço.
- **Seleção de Itens:** O cliente seleciona os itens desejados utilizando checkboxes, com a possibilidade de adicionar ou remover itens facilmente.
- **Cálculo do Total:**  O aplicativo calcula automaticamente o valor total do pedido, com base nos itens selecionados.
- **Campo de Observações:** Permite que o cliente adicione observações e preferências sobre os pratos.
- **Validação de Pedido:** Antes de finalizar o pedido, o aplicativo valida se o cliente selecionou pelo menos um item, caso contrário, exibe um aviso.
- **Envio de Pedido:** Um botão "Enviar Pedido" permite que o cliente envie seu pedido para o restaurante.
- **Toasts:**  O aplicativo utiliza toasts para informar ao cliente o status do pedido:
    - "Selecione pelo menos uma opção para calcular o seu pedido" (aviso de validação).
    - "Seu pedido foi enviado para o balcão do restaurante" (confirmação de envio).

### Interface do Aplicativo

A interface do aplicativo foi projetada com uma paleta de cores harmoniosa e intuitiva, e os elementos visuais foram organizados de forma clara e organizada, utilizando uma viewGroup adequada para a construção do menu. 

- A tela inicial exibe o título do aplicativo centralizado.
- As seções do cardápio são exibidas com títulos e subtítulos claros.
- Os pratos, bebidas e sobremesas são listados em seus respectivos grupos.
- O total do pedido é exibido em um TextView.
- Os botões "Calcular" e "Enviar Pedido" são destacados na tela.

### Implementação do Back-End

A implementação do back-end foi realizada utilizando a linguagem Java, com foco na validação de dados, cálculo do total do pedido e envio do pedido para o restaurante. As seguintes funcionalidades foram implementadas:

- **Validação de Itens:** Verifica se o cliente selecionou pelo menos um item no pedido.
- **Cálculo do Total:** Realiza a soma dos preços dos itens selecionados.
- **Envio de Pedido:** Envia as informações do pedido para o sistema de pedidos do restaurante.

**Exemplo de uso:**

https://github.com/josanpaier/WriteCode-Curso-Introducao-Desenvolvimento-Android/assets/131397521/1e5aeaf8-1e32-4bab-842d-1ccb5bb88db7

### Imagens das Telas do Aplicativo

<img src="https://github.com/josanpaier/WriteCode-Curso-Introducao-Desenvolvimento-Android/assets/131397521/e7f6da30-08a0-49b7-abeb-5d01e724c2dc" width="300px"/>

<img src="https://github.com/josanpaier/WriteCode-Curso-Introducao-Desenvolvimento-Android/assets/131397521/e2038c7c-155b-49a8-9d25-f7aa5a356971" width="300px"/>

### Código Fonte

O código fonte do aplicativo está disponível no repositório do GitHub: [[https://github.com/josanpaier/WriteCode](https://github.com/josanpaier/WriteCode-Curso-Introducao-Desenvolvimento-Android/blob/main/MenuApp.rar)]

### Conclusão

O projeto WriteCode foi uma excelente oportunidade para aplicar os conhecimentos adquiridos durante o curso de Introdução ao Desenvolvimento Android, resolvendo um problema real e inovando o atendimento do restaurante. O aplicativo desenvolvido é um exemplo de como a tecnologia pode otimizar processos e melhorar a experiência dos clientes.
