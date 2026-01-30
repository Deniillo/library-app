# Изменение по issue #6

### Решение задачи: Переименовать `PageController` в `SuperController`

**Шаги выполнения:**
1. **Переименование файла и класса**:
   - Изменяем название файла `PageController.ts` → `SuperController.ts`.
   - Внутри файла заменяем `class PageController` → `class SuperController`.

2. **Правка импортов**:
   - Находим все импорты `PageController` в проекте:
     ```bash
     grep -r "PageController" src/
     ```
   - Заменяем пути и названия в импортах:
     ```diff
     - import PageController from '../controllers/PageController';
     + import SuperController from '../controllers/SuperController';
     ```

3. **Обновление использования**:
   - Исправляем ссылки в маршрутах (например, `router.ts`):
     ```diff
     - router.get('/page', PageController.render);
     + router.get('/page', SuperController.render);
     ```

4. **Проверка нейминга**:
   - Убеждаемся, что:
     - Имена переменных (если были) изменены с `pageController` → `superController`.
     - Комментарии/документация не содержат устаревших упоминаний.

---

**Команды Git:**
```bash
git checkout -b rename-to-supercontroller
git add .
git commit -m "refactor: rename PageController to SuperController"
git push origin rename-to-supercontroller
```

---

**Pull Request Description:**
```markdown
## Что сделано?
- Переименован `PageController` → `SuperController`
- Обновлены все импорты и ссылки
- Удалены упоминания старого названия

Closes #<номер_исхода>
```

**Проверка:**
- Запустить тесты: `npm test`
- Проверить запуск приложения: `npm run dev`
- Убедиться, что роуты работают корректно.