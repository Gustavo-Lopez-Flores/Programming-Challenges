class Heroi {
  constructor(name, idade, tipo) {
    this.name = name;
    this.idade = idade;
    this.tipo = tipo;
    if (tipo === "mago") {
      this.ataque = "magia";
    } else if (tipo === "guerreiro") {
      this.ataque = "espada";
    } else if (tipo === "monge") {
      this.ataque = "artes marciais";
    } else if (tipo === "ninja") {
      this.ataque = "shuriken";
    }
  }
  atacar() {
    console.log(`O ${this.tipo} atacou usando ${this.ataque}`);
  }
}

let eu = new Heroi("Gustavo", 20, "mago");
eu.atacar();