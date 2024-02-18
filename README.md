### Ejectuar el proyecto como hot reload:

Ejecutar en una terminal:

    $ ./gradlew bootJar --continuous

Y en otra terminal:

    $ ./gradlew bootRun

### Migraciones

    # .env
    # Configuración de la base de datos MySQL
    DATABASE_URL="mysql://root:123@127.0.0.1:3306/gym_db"

Migraciones con DBMATE - accesos/sqlite3:

    $ npm run dbmate:new <<nombre_de_migracion>>
    $ npm run dbmate:up
    $ npm run dbmate:rollback

---

## Fuentes:

+ https://medium.com/@calism222/how-enable-auto-reload-spring-boot-gradle-kotlin-continuous-build-5edd23558ae3