					PlayerController
http://18.157.148.180:8080/swagger-ui.html#/player-controller

Стек:
java 11, testNg
Задание:
1. Написать фреймворк для тестирования приложения
2. Написать по 1 позитивному автотесту на каждый контроллер

Описание:
1. Данное приложение направлено на создание пользователей и операции с ним;
2. В системе уже присутствует два пользователя с ролями ‘supervisor’(данного
пользователя нельзя удалить, редактировать пользователя может только он
сам) и ‘admin’;
3. Swagger находится по пути {baseUrl}/swagger-ui.html

Основные требования к приложению:
1. Пользователь должен быть старше 16 и младше 60 лет;
2. Создавать пользователей могут только те, у кого роль: ‘supervisor’ или ‘admin’;
3. Создавать пользователя можно только с одной из ролей: ‘admin’ или ‘user’;
4. login уникальный для каждого пользователя;
5. screenName уникальный для каждого пользователя;
6. Пароль должен содержать латинские буквы и цифры (минимум 7 максимум 15
символов)
7. Пол пользователя может быть только: ‘male’ или ‘female’;