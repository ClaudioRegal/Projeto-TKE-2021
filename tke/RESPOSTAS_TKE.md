# TECHNICAL KNOWLEDGE EVALUATION (TKE) -

### POOL JAN-FEV/2021

---
---

>### **1) Quais são as principais atribuições de um QA?**

- Identificar e comunicar possíveis falhas, riscos e defeitos ao longo do processo;
- Validar o processo ao final de cada etapa;
- Domínio das funções de determinado software;
- Garantir que o software corresponda às necessidades do cliente;
- Análise de teste;
- Análise de negócios;
- Estratégia de teste;
- Teste manual;
- Automação de teste;
- Testes exploratórios;
- Testes de regressão;
- Criação e manutenção de dados de teste;
- Teste de manutenção e refatoração
O Analista de Qualidade desempenha muitas funções, apesar de grande parte das vezes contar com o auxílio de uma equipe.
Nem todos os QA’s saberão desempenhar todas essas tarefas, e não há nada de errado nisso. Porém, apesar do apoio,
para ser um bom QA é ideal executar grande parte dessas funções acima de forma satisfatória.
---
>## **2) Quais são as colunas default de um quadro Kanban? E para que servem cada uma?**

A estrutura Kanban é aplicada por meio de quadros Kanban,
uma forma de gerenciamento visual de projetos que permite às equipes visualizar melhor a sua carga e fluxo de trabalho. Em um quadro Kanban,
o trabalho é exibido como um quadro de projetos organizado por colunas. Tradicionalmente, cada coluna representa um estágio do trabalho.
Um quadro Kanban mais básico pode conter colunas como A fazer, Em andamento e Concluído. As tarefas individuais,
representadas como cartões visuais no quadro, percorrem as colunas até que sejam concluídas.

- **to do / a fazer: o que deve ser feito;**
- **doing / em andamento: tarefas em execução;**
- **done / concluido: tarefas concluídas.**
---
>## **3) O que é uma pirâmide de teste? Quais são seus níveis?**

A pirâmide de testes é uma ilustração que permite visualizar de forma simples os tipos de testes, seus níveis, velocidades, complexidades e “custos”.
Além disso ela busca dar um direcionamento em relação a quantidade de testes a ser implementados em cada nível.
Além do direcionamento em relação a quantidade também apresenta uma visão acerca da velocidade da execução dos testes
(e da sua criação também) e também do nível de isolamento do testes.
A pirâmide apresenta 3 níveis, são eles:

- **Base – Testes unitários**

      Os testes unitários é que eles são extremamente pequenos, rápidos e totalmente independentes.


- **Meio – Testes de integração**

      - Diferente dos testes unitários os testes de integração dependem de componentes externos para serem criados e executados.
      - Alguns casos comuns de cobertura de testes de integração são por exemplo.
      - Comunicação com bancos de dados
      - Comunicação entre micro serviços
      - Por usarem elementos externos os testes de integração precisam de maior infraestrutura para serem criados e executados.
      


- **Topo – Testes ponta a ponta (E2E)**

      - Os testes ponta a ponta (E2E) buscam testar todo um fluxo de funcionamento da aplicação.
      - Nesse caso a ideia é realmente validar todo o funcionamento de fluxos que o usuário mais faz.
      - O tempo de desenvolvimento e de execução de testes ponta a ponta é muito grande.
      - Levando assim a terem poucos testes de ponta a ponta, cobrindo só os casos principais na maior parte dos casos.
---
>## **4) Por que automatizar testes de software e por que não? Justifique.**

Atualmente, automatizamos cenários de testes para evitar trabalho manual em excesso, garantir que  há regressões no software,
obter um feedback mais rápido, economizar tempo executando testes repetidos.
Evitar trabalho manual em excesso é um grande motivo para realizar automação de testes em um software.
Através dos testes automatizados é possível obter um feedback mais rápido, por exemplo, visualizar quais testes  passaram e quais falharam,
em qual passo do teste teve erro e qual o motivo. Muitas ferramentas oferecem gráficos e relatórios onde é fácil analisar os resultados da execução de uma suíte de teste.



