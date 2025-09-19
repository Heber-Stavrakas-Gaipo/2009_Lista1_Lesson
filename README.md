# 📚 Sistema de Empréstimo de Mídias

> *Uma solução elegante para gerenciar empréstimos de mídias digitais e físicas*

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![Console](https://img.shields.io/badge/Interface-Console-green?style=for-the-badge)](https://en.wikipedia.org/wiki/Command-line_interface)

## 🎯 Visão Geral

O **Sistema de Empréstimo de Mídias** é uma aplicação Java console que demonstra os princípios fundamentais da **Programação Orientada a Objetos (POO)**. Este projeto simula um sistema real de biblioteca ou locadora, onde diferentes tipos de mídia podem ser emprestados a clientes.

### ✨ Por que este projeto é especial?

- 🏗️ **Arquitetura Limpa**: Implementação clara dos conceitos de POO
- 🔄 **Sistema de Estados**: Controle inteligente do status das mídias
- 📊 **Gestão de Dados**: Armazenamento estruturado com arrays
- 🎮 **Interface Intuitiva**: Menu interativo para navegação fácil
- 🛡️ **Tratamento Robusto**: Gerenciamento adequado de entradas do usuário

## 🏛️ Arquitetura do Sistema

### Diagrama de Classes
```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Emprestimo    │    │      Midia      │    │      App        │
├─────────────────┤    ├─────────────────┤    ├─────────────────┤
│ - data: String  │    │ - tipo: String  │    │ + main()        │
│ - cliente: String│ ◇──│ - descricao: ..│    │ - menu system   │
│ - midias: Midia[]│    │ - valor: float  │    │ - input handling│
├─────────────────┤    │ - status: boolean│   └─────────────────┘
│ + impressaoDados()│   ├─────────────────┤
└─────────────────┘    │ + alterarStatus()│
                       │ + retornaDados()│
                       └─────────────────┘
```

### 🔧 Componentes Principais

#### 📋 **Classe Emprestimo**
- **Responsabilidade**: Gerenciar dados do empréstimo
- **Características**:
  - Armazena data e cliente
  - Mantém array de até 5 mídias
  - Fornece visualização formatada dos dados

#### 💿 **Classe Midia**
- **Responsabilidade**: Representar itens emprestáveis
- **Características**:
  - Múltiplos construtores (flexibilidade)
  - Sistema de status (disponível/emprestado)
  - Formatação inteligente de dados

#### 🖥️ **Classe App**
- **Responsabilidade**: Interface e controle do fluxo
- **Características**:
  - Menu interativo com 3 opções principais
  - Tratamento robusto de entrada
  - Gerenciamento de estado da aplicação

## 🚀 Funcionalidades

### 📝 **1. Cadastro de Empréstimos**
```java
// Criação dinâmica de empréstimos
emprestimos[i] = new Emprestimo();
```
- ✅ Definição flexível da quantidade
- ✅ Entrada de dados do cliente
- ✅ Adição múltipla de mídias (até 5 por empréstimo)
- ✅ Validação de limites

### 🔍 **2. Consulta Individual**
- ✅ Listagem numerada dos empréstimos
- ✅ Seleção específica por índice
- ✅ Tratamento de registros inexistentes

### 📊 **3. Relatório Completo**
- ✅ Visualização de todos os empréstimos
- ✅ Formatação clara e organizada
- ✅ Filtragem automática de registros nulos

## 🎓 Conceitos de POO Demonstrados

### 🏗️ **Encapsulamento**
```java
public class Midia {
    public String tipo;
    public boolean status;
    
    public void alterarStatus() {
        status = !status; // Controle interno do estado
    }
}
```

### 🔄 **Composição**
```java
public class Emprestimo {
    public Midia[] midias; // Emprestimo "tem" Midias
}
```

### 🎯 **Polimorfismo de Construtores**
```java
public Midia() { /* Construtor padrão */ }
public Midia(String tipo, String descricao, float valor) { /* Construtor parametrizado */ }
```

### 📦 **Abstração**
- Métodos como `impressaoDados()` e `retornaDados()` abstraem a complexidade da formatação

## 🛠️ Como Executar

### Pré-requisitos
- ☕ Java JDK 8+ instalado
- 💻 IDE ou terminal com suporte a Java

### Passos
1. **Clone o repositório**
```bash
git clone [seu-repositorio]
cd Lista1
```

2. **Compile o projeto**
```bash
javac -d bin src/*.java
```

3. **Execute a aplicação**
```bash
java -cp bin App
```

### 🎮 Navegação
```
-------------------------------
Digite uma opção:
1 - Cadastrar emprestimo
2 - Imprimir um emprestimo  
3 - Imprimir todos emprestimos cadastrados
0 - Sair
```

## 📝 Exemplo de Uso

```
Digite a quantidade de emprestimos: 1
Digite a data do emprestimo 1: 2024-03-15
Digite o nome do cliente: João Silva

Digite o tipo de midia: DVD
Digite a descricao da midia: Filme de Ação
Digite o valor da midia: 5.99

--- Dados do Emprestimo ---
Data: 2024-03-15
Cliente: João Silva
Tipo: DVD
Descricao: Filme de Ação
Valor: 5.99
Status: Midia emprestada
```

## 🎯 Desafios Técnicos Resolvidos

### 🔧 **Gerenciamento de Buffer de Entrada**
```java
reader.nextInt();
reader.nextLine(); // Consome quebra de linha residual
```

### 🛡️ **Inicialização Segura de Arrays**
```java
emprestimos[i] = new Emprestimo(); // Evita NullPointerException
```

### 🔄 **Controle de Fluxo Inteligente**
```java
do {
    // Lógica do menu
} while (option != 0 && stopCondition < 5);
```

## 🎓 Aprendizados e Competências

### 🏗️ **Programação Orientada a Objetos**
- ✅ Design de classes coesas
- ✅ Relacionamentos entre objetos
- ✅ Encapsulamento de responsabilidades

### 💾 **Estruturas de Dados**
- ✅ Manipulação de arrays
- ✅ Gerenciamento de coleções
- ✅ Otimização de memória

### 🎮 **Interface de Usuário**
- ✅ Design de menus intuitivos
- ✅ Tratamento de entrada
- ✅ Experiência do usuário

### 🐛 **Debugging e Robustez**
- ✅ Tratamento de exceções
- ✅ Validação de dados
- ✅ Prevenção de erros comuns

## 🔮 Futuras Melhorias

- 💾 **Persistência**: Salvar dados em arquivo
- 🔍 **Busca Avançada**: Filtros por tipo/cliente
- 📅 **Controle de Prazo**: Sistema de datas de devolução
- 🎨 **Interface Gráfica**: Migração para JavaFX
- 🌐 **API REST**: Exposição de serviços web

## 📚 Estrutura do Projeto

```
Lista1/
├── 📄 README.md              # Este arquivo
├── 📁 src/                   # Código fonte
│   ├── 🎯 App.java          # Classe principal
│   ├── 📋 Emprestimo.java   # Modelo de empréstimo
│   └── 💿 Midia.java        # Modelo de mídia
├── 📁 lib/                   # Dependências externas
└── 📁 bin/                   # Arquivos compilados (.class)
```

## 🤝 Contribuições

Este projeto foi desenvolvido como parte dos estudos de **Programação Orientada a Objetos**. Contribuições são bem-vindas para:

- 🐛 Correção de bugs
- ✨ Novas funcionalidades
- 📖 Melhorias na documentação
- 🧪 Adição de testes unitários

---

<div align="center">

**💻 Desenvolvido com ❤️ em Java**

*"A programação orientada a objetos não é apenas sobre objetos, é sobre como eles se relacionam"*

</div>
