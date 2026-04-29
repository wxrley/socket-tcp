<p align="center">
  Language:
  <a href="README.md">English</a> | 
  <a href="README.pt.md">Português</a>
</p>

# Comunicação TCP
Este projeto demonstra o funcionamento da comunicação entre processos via protocolo **TCP/IP** com a API nativa do Java. \
Inclui exemplos de como estabelecer conexões, trocar mensagens e encerrar sessões com segurança.

## Funcionalidades
- Envio e recebimento de mensagens em tempo real.
- Conexão estável entre cliente e servidor via TCP.
- Encerramento com o comando **exit**.
- Exibição no console para acompanhar o diálogo completo.

## Tecnologias
- Java
- Sockets TCP
- I/O Streams

## Estrutura
```
📂 SocketTCP/
├── Client.java
└── Server.java
```

## Instalação
**1.** Verifique se o **Java** está instalado em sua máquina:
> Para confirmar, execute no terminal:
> ```bash
> java -version
> ```
> Caso não esteja instalado, baixe o [Java](https://www.oracle.com/java/technologies/downloads/).

**2.** Baixe ou clone o repositório:
> ```bash
> git clone https://github.com/wxrley/socket-tcp.git
> ```

## Execução
### Opção 1 — Via Terminal
**1.** Navegue até a raiz do projeto e compile os arquivos:
> ```bash
> javac Server.java Client.java
> ```
**2.** Execute o servidor:
> ```bash
> java Server
> ```
**3.** Em outro terminal, execute o cliente:
> ```bash
> java Client
> ```
> Digite mensagens — o servidor responde em tempo real.
> Para encerrar, digite **exit**.

### Opção 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.)
**1.** Abra a pasta do projeto na sua IDE preferida. \
**2.** Abra o arquivo `Server.java` e clique em **Run** para iniciar o servidor. \
**3.** Em seguida, abra o arquivo `Client.java` e clique em **Run** para iniciar o cliente. \
**4.** Use o console da IDE para digitar e visualizar as mensagens trocadas. \
**5.** Digite **exit** no cliente para finalizar a comunicação.
