# Declare an optional (nullable) variable
nickname = None   

# access using a default value
name = nickname if nickname is not None else "Guest"

print("Name:", name)