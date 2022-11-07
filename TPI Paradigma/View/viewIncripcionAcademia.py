# Se crea la ventana para que se ingresen los datos
from tkinter import *
import tkinter as tk

# 1.- Crea la ventana
# 2.- Configura la ventana
ventana = Tk()
ventana.title("Registrar Incripcion a Academia")
ventana.geometry("400x500")
ventana.configure(background="light blue")

# Crea los campos de texto con su label correspondiente
Label(ventana, text="Registrar Inscripción", fg="dark blue", font="verdana 15", background="light blue").pack()
lblAlumno = Label(ventana, text="Alumno:", background="light blue").place(x=120, y=60)
ventana.mainloop()