import os

list=[]

if os.path.exists("words.txt"):
            with open(file_path, 'r') as file:
                for line in file:
                    word = line.strip()
                    list.append(word)
else:
    print(f"File '{file_path}' not found!")

def word_ladder():
  #write code here
  return []

print(word_ladder("calf", "lamb"))  # [calf, caff, cafe, came, lame, lamb]
