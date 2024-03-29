## Описание проекта
REST-сервис для загрузки файлов и вывода списка уже загруженных файлов пользователя.

Все запросы к сервису авторизованы. Заранее подготовленное веб-приложение (FRONT) подключается к разработанному сервису. 

## Описание приложения

- Сервис предоставляет REST-интерфейс для интеграции с FRONT.
- Сервис реализовывает все методы, описанные в [yaml-файле](./CloudServiceSpecification.yaml):
  1. Вывод списка файлов.
  2. Добавление файла.
  3. Удаление файла.
  4. Авторизация.
- Все настройки вычитываются из файла настроек (yml).
- Информация о пользователях сервиса (логины для авторизации) и данные хранятся в базе данных.

## Реализация

- Приложение разработано с использованием Spring Boot.
- Использован сборщик пакетов maven.
- Для запуска используется docker, docker-compose.
- Код размещён на Github.
- Код покрыт unit-тестами с использованием mockito.
- Добавлены интеграционные тесты с использованием testcontainers.
