# Build Instructions

### `mgm-crm` Repo

This project stores customer information

Git clone the project to local
```
# SSH Option
git clone https://github.com/abidur-rehman/mgm-crm.git
git checkout develop
(or)
git checkout <feature-branch>

```

### Build

```
mvn clean compile
```

# Database Setup

PostgreSQL must be available on localhost, port 5432 for this project to work.

# Database Migration

Use `flyway maven plugin` to run further scripts under `src/sql/updates`
In case you have some stale data, use `mvn flyway:clean` - otherwise please avoid using clean
```
mvn flyway:migrate
```

Usually the database scripts are stored under each module. Also each module use separate `schema`. 

### Update script naming convention

```
V0100__create_person.sql
```

* `V` is mandatory
* `01` is the sprint no
* `00` is the sequence no for the scripts in a sprint
* `__` double underscore
* clear naming of what script is doing

