
    
## 📊 Diagrama de Classes

```mermaid
classDiagram
    class Curso {
        <<abstract>>
        -String codigo
        -String nome
        -int cargaHorariaTotal
        -int duracao
        -String tipoDuracao
        -String modalidade
        -String status
        +obterDisciplinas()* List~String~
        +obterAlunosAtivos()* List~String~
        +obterAlunosEgressos()* List~String~
    }
    
    class CursoTecnico {
        -String eixoTecnologico
        -double cargaHorariaEstagio
        +verificarEstagioObrigatorio() boolean
    }
    
    class CursoGraduacao {
        -String tipo
        -boolean tccObrigatorio
        +validarTCC() boolean
    }
    
    class CursoPosGraduacao {
        -String tipo
        -String areaDePesquisa
        +validarDissertacao() boolean
    }
    
    Curso <|-- CursoTecnico
    Curso <|-- CursoGraduacao
    Curso <|-- CursoPosGraduacao
