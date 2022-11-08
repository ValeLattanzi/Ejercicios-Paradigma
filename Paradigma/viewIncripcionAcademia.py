# Esta ventana se encarga de registrar los datos de la inscripcion de la academia
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
# Datos Numero Inscripcion
lblNumeroInscricion = Label(ventana, text="Numero Inscripcion:", background="light blue").place(x=20, y=60)
entryNumeroInscripcion = Entry(ventana).place(x=140, y=60)
# Datos Fecha Inscripcion
lblFechaInscripcion = Label(ventana, text="Fecha Inscipcion:", background="light blue").place(x=37, y=80)
entryFechaInscripcion = Entry(ventana).place(x=140, y=80)
# Datos Alumno
lblAlumno = Label(ventana, text="Alumno:", background="light blue").place(x=90, y=160)
entryAlumno = Entry(ventana).place(x=145, y=160)
# Datos Estado
lblEstado = Label(ventana, text="Estado:", background="light blue").place(x=270, y=30)
# Datos Tarifas
lblTarifas = Label(ventana, text="Tarifas:", background="light blue").place(x=120, y=250)
#comboTarifas = Listbox(ventana).place(x=180, y=250)
ventana.mainloop()