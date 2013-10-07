# Спецкурс "Agile Development"

Нижегородский Государственный Университет им. Н.И. Лобачевского  
Факультет ВМК, каф. МО ЭВМ

**License**: Creative Commons Attribution-Share Alike 3.0
([CC BY-SA 3.0](http://creativecommons.org/licenses/by-sa/3.0/))

## Ресурсы

 - [Google-группа](<https://groups.google.com/forum/?hl=ru#!forum/agile-development-course>) - 
   просьба по всем вопросам обращаться сюда.
 - [Результаты тестирования](https://travis-ci.org/UNN-VMK-Software/agile-development-course)
 - [Таблица успеваемости](https://docs.google.com/spreadsheet/ccc?key=0AsBBkrQIoSbjdGh5UFhSRVdQZmZhWXJLNjhwV08zU0E&authkey=CNXx0YMC&authkey=CNXx0YMC#gid=7)
 - [Экзаменационные вопросы](https://docs.google.com/spreadsheet/ccc?key=0AsBBkrQIoSbjdDBDS2FTb3B3d3ZlUldJcl9HUmtEaUE&authkey=CKGP8vYB&authkey=CKGP8vYB#gid=0)
 - Литература:
   - Мика Мартин, Роберт Мартин "Принципы, паттерны и методики гибкой разработки на языке C#"
     ([pdf](http://www.books.ru/books/printsipy-patterny-i-metodiki-gibkoi-razrabotki-na-yazyke-c-fail-pdf-864714/?show=1))
   - Мартин Фаулер, Кент Бек и др. "Рефакторинг: улучшение существующего кода"
     ([pdf](http://www.books.ru/books/refaktoring-uluchshenie-sushchestvuyushchego-koda-fail-pdf-552092/?show=1))

## Вопросы

### Введение в Agile

2, 3, 4

  1. Какие факторы повлияли на содержание первых методологий разработки.
  1. Достоинства и недостатки каскадной модели.
  1. Манифест ГТР.
  1. Определение ГТР.
  1. Основные черты гибких методологий разработки.
  1. Факторы, противодействующие внедрению ГТР.

### Чистый код

2, 4, 5

  1. Почему важно поддерживать код в чистоте.
  2. Ключевые понятия при разговоре о качестве кода, их использование.
  3. Основные правила именования.
  4. Основные правила оформления функций. Способы решения каждой из проблем.
  5. Примеры плохих комментариев, почему они считаются code smell.

### Рефакторинг

1, 3, 4

  1. Определение рефакторинга и его цели.
  1. Техника безопасности.
  1. Понятие технического долга.
  1. Примеры запахов (code smell) и способы их устранения (3-5 примеров).
  1. Примеры рефакторингов (конкретных приемов), не менее 6 штук.

## Лабораторные работы

### 0. Настройка окружения

  1. Вступите в группу [agile-development-course](https://groups.google.com/forum/?hl=ru#!forum/agile-development-course),
     которую мы будем использовать для общения. По всем вопросам необходимо
     обращаться туда. 
  1. Выберите себе тему из
     [списка](https://docs.google.com/spreadsheet/ccc?key=0AsBBkrQIoSbjdGh5UFhSRVdQZmZhWXJLNjhwV08zU0E&usp=drive_web&authkey=CNXx0YMC&authkey=CNXx0YMC#gid=8), 
     вписав свое имя и группу.
  1. Зарегистрируйтесь на GitHub, предпочтительно использование аккаунта, из
     котого понятно ваше имя (опционально).
  1. Создайте форк нашего проекта: <https://github.com/UNN-VMK-Software/agile-development-course>,
     клонируйте репозиторий к себе на рабочую машину. Все необходимые инструкции
     можно найти [здесь](https://help.github.com/articles/fork-a-repo).
  1. В подпапке `code` заведите папку со своим именем (`name-surname`), и
     поместите туда файл `README.md`. Это будет ваша wiki страничка в формате
     Markdown со всеми деталями о вашем проекте.
  1. Заполните свой `README.md` информацией, по образу файла в директории
     `code/kirill-kornyakov`. Просьба следить за грамматикой, файлы с ошибками
     будут возвращаться на доработку. Также просьба следить за корректностью 
     [синтаксиса Markdown](https://help.github.com/articles/github-flavored-markdown).
  1. Когда все будет готово, стоит проверить, правильно ли генерируется html на
     основе вашего Markdown. Для этого можно воспользоваться утилитой pandoc,
     или например текстовым редактором, который умеет рендерить html. Также
     можно сделать push в свой форк проекта и проверить, что GitHub корректно
     отображает файл.
  1. После того как вы убедились, что файл выглядит хорошо, нужно будет
     сделать локальный коммит в Git, затем сделать push изменений в ваш форк на 
     GitHub (если вы не сделали этого не предыдущем шаге).
  1. Когда ваши коммиты попадут на GitHub, нужно будет сделать 
     [pull-request](https://help.github.com/articles/using-pull-requests) в
     [центральный репозиторий](https://github.com/UNN-VMK-Software/agile-development-course).
     Большая просьба в названии pull-request указать свою фамилию и номер
     лабораторной, например _"Корняков - Лабораторная работа #0"_.
  1. Если будут замечания к вашему коду, вы можете просто добавлять коммиты в
     свою ветку `master`, и пулл-реквест будет автоматически обновляться.