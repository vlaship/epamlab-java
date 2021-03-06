Разработать систему менеджмента сотрудниками компании.

Информация о сотрудниках включает в себя персональные данные, рабочий отдел, график отпусков, размер заработной платы и т.п.

Доступ в систему имеют все сотрудники компании, но обладают при этом разными ролями. Пользовательский интерфейс, в зависимости от роли, должен позволять:

1. Рядовые сотрудники имеют возможность только просматривать информацию о себе и делать запрос на отпуск в будущем.

2. Руководители отделов могут просматривать информацию всех сотрудников отдела и подтверждать/отклонять отпуска.

3. Высшее руководство имеет полномочия руководителей отделов + редактирование персональных данных и размера з/п.

Основные требования:

1. Исходный код должен поставляться в формате "сборка и запуск в один клик". Т.е. либо поставляется с конфигурационным файлом системы сборки (pom.xml, build.gradle, etc), либо содержит все необходимые библиотеки в поддиректории /lib.

2. Код должен быть написан в соответствии с паттерном MVC.

3. Предпочитаемые базы данных - mysql, sqllite. Вместе с кодом должен поставляться скрипт развёртывания базы (для случая mysql-like баз) либо файл самой базы (sqllite-like).

4. Работа с базой данных может выполнятся с помощью любых фреймворков (или без них, на чистом jdbc), но предпочтительным является hibernate.

5. Желательно (но не обязательно) использование IoC-фреймворка (Spring, guice, etc).

6. UI-часть в идеальном случае - web-интерфейс на любом современном javascript-фреймворке (с restful-бекендом). В простейшем случае допускается связка pure servlet + jsp и их аналоги либо только backend (restful web-service).

Готовое задание высылайте в архиве на почту или публикуйте в любом доступном репозитории.