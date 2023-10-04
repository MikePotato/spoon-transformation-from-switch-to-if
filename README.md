# spoon-transformation-from-switch-to-if

## Remarks
Проект в данном репозитории использует JDK 11 и поэтому не включает в себя ряд тестов на фичи оператора\выражения switch, которые были реализованы в более поздних версиях.

Проект с аналогичным кодов под JDK19 + расширенные тесты (для фич switch из более поздних версий языка) доступен тут - https://github.com/MikePotato/spoon-transformation-from-switch-to-if-dev


## Get started

Для запуска взять java_code_source_processor.jar из [artifacts](https://github.com/MikePotato/spoon-transformation-from-switch-to-if/tree/main/java_code_source_processor_JDK11/out/artifacts) и запустить с указанием параметров --ARG_NAME_FOR_INPUT и --ARG_NAME_FOR_OUTPUT:

```
java -jar c:\java_code_source_processor.jar --ARG_NAME_FOR_INPUT D:\in\java_code_source_input\src --ARG_NAME_FOR_OUTPUT d:\out
```

В качестве проекта для конвертации можно использовать проект вот отсюда: https://github.com/MikePotato/spoon-transformation-from-switch-to-if/tree/main/java_code_source_input

### NOTES 

1. Для параметра --ARG_NAME_FOR_INPUT лучше указывать непосредственно папку с java файлами. Если указать весь проект, то spoon может немного структурно поломать его. 

2. Тест TaskSnippetsTests на функционнальную тождественность методов из задания не проходил, поэтому был закомментирован.
