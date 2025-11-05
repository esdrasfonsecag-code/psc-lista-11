# 🚗 Sistema de Veículos — Abstração e Polimorfismo em Java

Este projeto foi desenvolvido como exercício prático para aplicar os conceitos de **Abstração**, **Herança** e **Polimorfismo** em Java, modelando diferentes tipos de veículos em um sistema orientado a objetos.

---

## 🧠 Conceitos Aplicados

- **Classe abstrata:** `SistemaVeiculo` serve como base para todos os tipos de veículos.
- **Método abstrato:** `acelerar()` é implementado de forma diferente em cada subclasse.
- **Polimorfismo:** O método `main()` utiliza referências do tipo `SistemaVeiculo` para acessar objetos de diferentes classes concretas (`Carro`, `Moto`, `Caminhao`).

---

## 🏗️ Estrutura do Projeto

src/
└── SistemaVeiculo/  
├── SistemaVeiculo.java # Classe abstrata com o método main  
├── Carro.java # Subclasse concreta   
├── Moto.java # Subclasse concreta  
└── Caminhao.java # Subclasse concreta  

---

## 🧩 Saída Esperada 
Marca: Toyota  
Modelo: Corolla  
Ano: 2022  
Carro está acelerando de 0 a 100 km/h em 8 segundos.  

Marca: Honda  
Modelo: CB 500  
Ano: 2023  
Moto está acelerando e empinando a roda dianteira!  

Marca: Volvo  
Modelo: FH16  
Ano: 2020  
Caminhao está engrenando a próxima marcha e acelerando lentamente.  

---
