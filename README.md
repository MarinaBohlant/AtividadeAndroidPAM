# AtividadeAndroidPAM

### Etapas para a criação de um repósitorio 

- De início é preciso criar um repositório no GitHub:

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/0f2d8d6b-111d-4a84-8d5d-fa504732ef80)

- Com o repostório criado, vá até a pasta do seu projeto e clique com o botão direito e selecione "Git Bash Here"

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/2ba893b3-b119-4950-8bb9-179598819f9c)

- Abrirá esta Prompt de comando:

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/661eafc2-ee40-4318-83a7-7d46cfcbb870)

- Dentro do prompt, execute a primeira parte dos seguintes códigos:

```
git config --global user.name "usúario do GitHub"
git config --global user.email "Email do GitHub"
```
![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/e12acc89-b550-40e0-8e05-626db30099c8)

- Agora, execute a segunda parte dos seguintes códigos:

**1- "git init" Serve para iniciar a sessão, por isso é utilizado no começo.**
![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/0e692355-0a32-4e94-94ff-66ce22930212)

**2- "git status" Serve para consultar as ultimas alterações feitas no projeto.**

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/8fcaff1d-6cd2-4023-a7c1-a356be515387)

**3- "git add ." Serve para adicionar no repositório.**

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/df80b1b3-4903-41a0-b8e4-e6fe8729ee1f)

**3- "git commit -a -m "Mensagem" " Serve para  preparar tudo que você alterou no projeto. O -a coloca no commit todo tipo de arquivo. 
O -m serve para escrever uma mensagem no commit**

![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/16a4ece4-cff4-4859-9476-28a872317261)

- No seu repositório no GitHUb, procure a  parte que tenha escrita "...Or push an existing repository from  the command line".
**Copie e coloque no prompt.**

  
![image](https://github.com/MarinaBohlant/Atividade_Android/assets/128148126/df45d8cf-7b7f-44f4-9e72-0f1fb4b2f9a8)

Se tudo ocorrer certo, os arquivos da pasta estarão lá.

# Apresentação dos exercícios
## MENU DE STRING (STRINGS.XML)

<img src="/Imagens/Strings.jpeg">

No menu de strings podemos perceber que existem vários elementos, aonde cada um deles vai referenciar um elemento em todas as activities já criadas. 
 
Na confecção de uma nova string, existe uma ordem de ações para se criar uma normalmente, e pegando de exemplo as strings apresentadas, podemos entender que:

- (<string>…</string>): É o nome da tag de criação de uma string, onde nela serão contidas suas informações específicas; 
- (name=”...”): É o nome que irá identificar a string de um elemento específico, onde, neste caso, foi utilizada o nome Identificador dos elementos nas activities; 
- (<>”…"<>): Referente ao que se encontra dentro da tag, é o conteúdo que vai aparecer visualmente para o usuário.

## DEMONSTRAÇÃO DE LAYOUT
### Página Inicial (activity_main.xml)

<img src="/Imagens/InicioApp.jpeg">

Podemos observar que essa activity é minimalista, mostrando apenas um texto de boas vindas (numa TextView), um botão para entrar para entra no primeiro exercício e um outro botão para entrar no sexto exercício.

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 1
### Página Inicial (MainActivity.java)

<img src="/Imagens/TelaInicial1java.jpeg">

Nos elementos mostrados acima, tirando os que já aparecem ao iniciar uma nova activity, podemos notar que existem elementos “privados” à serem utilizados, sendo eles os mesmos que se encontram no design da tela (neste caso, a inicial).

Na declaração de elementos criados na activity, existe uma ordem de ações para se declarar as mesmas, sendo essa ordem:

- (private): É um modificador de acesso que indica que a variável só pode ser acessada dentro da classe em que ela foi declarada; 
- (TextView/Button): É o tipo da variável que já foi criada; 
- (txtInicio/btnExerc1/btnExerc2): É o nome atribuido ao identificador do elemento.

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 2
### Página Inicial (MainActivity.java)

<img src="/Imagens/TelaInicial2java.jpeg">

Nos elementos mostrados acima, podemos entender alguns conceitos ao observar-mos melhor cada comando presente. 

Primeiro foi definido cada View de cada botão para podermos dar funções aos botôes (“btnExerc1 = findView...”) utilizando dos ID’s de cada botão criado na activity. Das outras funçôes nós podemos observar as seguintes:

- (“new View.OnClickListener()”): Isso cria uma instância de um objeto que implementa a interface View.OnClickListener, o que permite que possa ser definido o que acontecerá quando o botão for clicado; 

- (“public void onClick(View v)”): Este é o método onClick que será chamado quando o botão for clicado. Ele recebe uma referência à View que foi clicada, onde nesse caso, é o mesmo botão; 

- (“Intent Exerc1 = ...”): Aqui, você está criando um novo objeto Intent, que é usada para iniciar outras atividades (nesse caso, a MainActivity2); 

- (“startActivity(Exerc1)”): Isso inicia a atividade MainActivity2 usando o Intent criado.

A mesma coisa pode ser dita do segundo botão, afinal a sua função é a mesma, mas o diferencial é que ela vai abrir uma outra Intent.

## DEMONSTRAÇÃO DE LAYOUT
### Página do Exercício 1 (Activity_Main2.xml)

<img src="/Imagens/Exercicio1.jpeg">

Podemos observar que nesse layout também foi utilizado um formato “minimalista” por ser simples, contendo 2 TextView que irão mostrar o que é para ser digitado, duas EditText que irão mostrar aonde é para ser digitado, outra TextView que vai mostrar o resultado do que será pedido e um botão para verificar o resultado.

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 3
### Página do Exercício 1 (MainActivity2.java)

<img src="/Imagens/Exercicio1p1.jpeg">

Podemos observar a criação de alguns elementos na classe do segundo exercicio (MainActivity2), onde foram criados 3 TextView, sendo esses para demonstrar um texto que vai definir para o usuário o que será preciso ser feito, e um para mostrar o resultado da conta do exercício. Podemos ver também que foram criados 2 EditText para o usuário poder digitar os valores à serem comparados e um botão para fazer o cálculo e a verificação. 

Existe também a verificação e o “vínculo” de cada um desses elementos com os elementos que estão no design da Activity, utilizando dos identificadores de cada um (“txtNum1 = findView...”).

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 4
### Página do Exercício 1 (MainActivity.java)

<img src="/Imagens/Exercicio1p2.jpeg">

Partindo para a lógica do exercício, foi criado uma public void que vai “receber” um valor clicável, ou seja, ao clicar, vai acontecer o que está dentro das chaves, que vai ser explicado a seguir. 

Foram utilizados dois valores inteiros para armazenar os valores que o usuário vai digitar, além de ter linkado esses valores com suas respectivas EditText’s e ter transformado o que estiver nessas EditText em strings (“.getText().toString()”). 

Chegando em uma parte importante do código, foi criado uma condicional para que se fosse verificado se ambos valores que o usuário escolheu são múltiplos entre sí, além de garantir que se a condicional é verdadeira, vai aparecer uma certa frase, e se for falsa, outra frase, pegando os valores da ultima TextView e colocando essas frases como um texto dentro delas (“txtResult.setText()”).

## DEMONSTRAÇÃO DE LAYOUT
### Página do Exercício 6 (Activity_Main3.xml)

<img src="/Imagens/Exercicio6.jpeg">

Partindo para o design do último exercício, podemos ver alguns elementos, colocando em foco um que ainda não foi utilizado, e que vai mostrar uma imagem (ImageView), 2 EditText para se digitar os valores pedidos (código do produto e sua quantidade), 1 TextView para ver o valor final da compra, e 1 botão para calcular os valores de cada lanche com a quantidade pedida. 

**OBS: Para se colocar uma imagem, é preciso colocar a imagem em sí na pasta drawables, como visto da imagem no design e dentro da ImageView.**

<img src="/Imagens/pastaDrawables.jpeg">

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 5
### Página do Exercício 6 (MainActivity3.java)

<img src="/Imagens/Exercicio6p1.jpeg">

Podemos observar que na classe do exercício 6, foram chamados 2 EditText para o código de cada produto e para a quantidade de cada um dos produtos, e uma TextView para mostrar o resultado das contas dos valores. 

Existe também uma outra a verificação e um outro “vínculo” de cada um desses elementos com os elementos que estão no design da Activity, utilizando dos identificadores de cada um (“editTextCod = findView...”).

## DEFINIÇÃO DOS ELEMENTOS NO JAVA - PART 6
### Página do Exercício 6 (MainActivity3.java)

<img src="/Imagens/Exercicio6p2.jpeg">

Na parte lógica do exercicio 6, podemos ver que foi utilizado outra public void para se receber outra valor clicável para se fazer os cálculos do exercício em sí, além da definição de variáveis que irão guardar os valores que ficarão dentro de cada EditText correspondente, junto de uma variável que vai guardar um valor decimal para o preço final da compra. 

Passando para a condicional, foi criado uma condicional que vai verificar cada um dos códigos digitados e apresentados para o usuário, além de fazer o cálculo de cada lanche com a quantidade pedida, e também apresentar o valor da compra no final junto de uma frase mostrando o mesmo (“Valor Final:”), colocando até outra frase de falha caso os códigos digitados não forem os que foram especificados.
