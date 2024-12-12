## Task4-5
��������� �����.

# ��������

��� JavaFX-���������� ������������ ����� �����-���, ������� ��������� ������������ ������������� ����������� �� ��������� �����. ���������� ���������� �������� �������� � ��������� ��� ���������� ������������� � �������� ���������� ���������. ������������ ����� ������� ����� � �������������, ��������� �������� ����� �������� � ������������� ����� ������������� �������.

### �������� ����������:

1. **HelloApplication**  
   �������� ����� ����������. �������� �� ������ ���������� � �������� FXML-�����.

2. **HelloController**  
   ����������, ������� ������������ ���������������� ����, ��������������� � ���������� ����������� � ���������� ����������, � ����� ��������� �����-��� � ����������� ���������. ���������:

- �������������� � ConcreteAggregate ��� ��������� ������ �����������.
- ��������� �������, ����� ��� ������� ������ ��� ���������� �����-���.
- ���������� ������ "������� �����", "���������", "����������", "��������� ��������" � "�����/����".

3. **Aggregate**  
��������� ��� ��������� �����������. ������������� ������ ��� ��������� ��������� � ���������� �����������.

4. **Builder**
��������� ��� ��������� ����������. ������������� ������ ��� ��������� � �������� ���������� ���������.

5. **Iterator**
��������� ��� ��������� �����������. ������������� ������ ��� ����������������� ������� � ������������.

6. **ConcreteAggregate**
���������� ���������� Aggregate. ��������� ����������� �� ��������� ����� � ������������� �������� ��� ������� � ���.

7. **ConcreteBuilder**
���������� ���������� Builder. ������ ��������� ��������� �� ������ ���������� ����������.

8. **ConcreteIterator**
���������� ���������� Iterator. ��������� ��������������� ���������� ����������� �� ������.

9. **Director**
�����, ������� ��������� ��������� ���������� ���������� � �������������� ���������.

10. **Indicator**
�����, �������������� ��������� ���������. ���������� ������� ��������� � �����-���.

11. **ImageIterator**
�����, ����������� �������� ��� �����������. ��������� ���������� ����������� �� ��������� �����.

---

### ������������� ����������������:

1. **�����-���**
������������ ����� ������������� ����������� �� ��������� �����. �������� �������������� ������������ � �������� ��������� � ������ ������������ �� ��������� ��� ���������� �����������.

2. **��������� ���������**
���������� ������� ��������� � �����-���. ��������� ������������� ����������� ��� ������������ ����� �������������.

3. **��������� ��������**
������������ ����� ������ ����� �������� ����� ������������� �����������.

4. **����� �����**
����������� ������ ����� � ������������� ����� ���������� ����.

5. **��������� ������**
���� ������������ �������� ������� ����� ��� ����������� ��� ������ ������������ ��������, ������������ ��������� �� ������.

---

### ����������

- **JavaFX** � ��� ���������� ������������ ���������� � ��������� ����������������� �����.
- **FXML** � ��� �������������� �������� ����������.
- **������� "��������"** � ��� ����������������� ������� � ������������.
- **������� "���������"** � ��� �������� ���������� ���������.

---

### ������������ ������ ���������

���������� ������������� ������� � ����������� ���������:

1. **����� �����:**
������������ �������� ������ "������� �����" � �������� ���������� � �������������.

2. **��������� ��������:**
������������ ������ �������� �������� � ������������� � �������� ������ "���������".

3. **�����-���:**

- ������� ������ "?" ��� ������� �����-���.

- ����������� ������ "���������" � "����������" ��� ������� ������������.

4. **��������� ���������:**
��������� ������������� ����������� ��� ������������ ����� �������������.

---

### �����������

- ��������� ������� ��������� ���.
- ���������� �������� �������� � ��������� ��� ���������� ������������� � �������� ����������.
- ����� ����������� ����������� ����� �������.

## ������������ ������ ���������
![������� ���� ���������](https://github.com/23yulia03/Task4-5/blob/main/img/img.png)

## �����������
![����� �� ����� ��������� �������](https://github.com/23yulia03/Task4-5/blob/main/task4-5.png)

## ��������� �������

```bash

com/example/task45
??? HelloApplication.java     # �������� ����� ����������
??? HelloController.java      # ����������
??? Aggregate.java            # ��������� ��� ��������� �����������
??? Builder.java              # ��������� ��� ��������� ����������
??? Iterator.java             # ��������� ��� ���������
??? ConcreteAggregate.java    # ���������� ��������� �����������
??? ConcreteBuilder.java      # ���������� ��������� ����������
??? ConcreteIterator.java     # ���������� ���������
??? Director.java             # �������� ��� ���������� ��������� ���������� ����������
??? Indicator.java            # ����� ���������� ���������
??? ImageIterator.java        # �������� ��� �����������
??? README.md                 # ������������ �������

