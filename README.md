### Ejectuar el proyecto como hot reload:

Ejecutar en una terminal:

    $ ./gradlew bootJar --continuous

Y en otra terminal:

    $ ./gradlew bootRun

### Migraciones

    # .env
    # Configuración de la base de datos MySQL y otros
    DATABASE_URL="mysql://root:123@127.0.0.1:3306/gym_db"
    ENV="local"

Migraciones con DBMATE - accesos/sqlite3:

    $ npm run dbmate:new <<nombre_de_migracion>>
    $ npm run dbmate:up
    $ npm run dbmate:rollback

## Diagrama de Clases



```plantuml
@startuml
package Accesos <<Folder>> {
  class User {
    - id: INT
    - user: STRING {50}
    - password: STRING {50}
    - activation_key: STRING {25}
    - image_url: STRING {40}
    - reset_key: STRING {25}
    - created_at: DATETIME
    - updated_at: DATETIME
    - user_state_id: INT {FK}
  }

  class UserState {
    - id: INT
    - user: STRING {15}
  }

  class Role {
    - id: INT
    - user: STRING {25}
  }

  class UserRole {
    - id: INT
    - user_id: INT {FK}
    - role_id: INT {FK}
  }
}

package Admin <<Folder>> {
  class Employee {
    - id: INT
    - user: STRING {50}
  }
}

User -- UserState
User --* UserRole
Role --* UserRole
User -- Employee

@enduml



---

## Fuentes:

+ https://medium.com/@calism222/how-enable-auto-reload-spring-boot-gradle-kotlin-continuous-build-5edd23558ae3