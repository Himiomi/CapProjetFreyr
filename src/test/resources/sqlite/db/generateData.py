import time, sqlite3, json, requests
import datetime
import random
from random_word import RandomWords
import numpy as np

numdays = 24 * 40
NbrCapteur = 8
NbrTypes = 5
NbrStation = 6

r = RandomWords()

conn = sqlite3.connect('test-chinook.db')
c = conn.cursor()
base = datetime.datetime.today()
date_list = np.arange(datetime.datetime(2023, 1, 1, 0, 0), datetime.datetime(2024, 12, 12, 23, 0),
                      datetime.timedelta(hours=6)).astype(datetime.datetime)

list_types=[1,2,3,4,1,2,3,4]
list_station=[1,1,2,2,3,3,4,4]

c.execute("delete from SensorValue;")
c.execute("delete from Sensor;")
c.execute("delete from Station;")
c.execute("delete from Type;")
conn.commit()

for i in range(0, NbrTypes):
    c.execute("insert into Type values (%d,\"NbrTypes_%s\");" % (i,r.get_random_word()))

for i in range(0, NbrStation):
    c.execute("insert into Station values (%d,\"Station_%s\");" % (i,r.get_random_word()))
    
for i in range(0, NbrCapteur):
    c.execute("insert into Sensor values (%d,%d,\"%s\",%d,\"Station_%s\");" % (i,list_station[i-1],str(date_list[i-1]),list_types[i-1],r.get_random_word()))

z = 0
compteur=0
for capteur in range(0, 9):
    z = random.randint(-10, 10)
    for i in range(0, numdays):
        statement="INSERT INTO SensorValue VALUES (\"%s\",1,%s,1,\"%s\",\"%s\");" % (
            str(compteur),str(capteur + 1), str(date_list[i]), str(z))
        print(statement)
        c.execute(statement)
        z += random.randint(-5, 5)
        compteur+=1
conn.commit()
