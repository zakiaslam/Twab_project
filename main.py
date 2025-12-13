import pandas as pd
from sqlalchemy import create_engine
import urllib.parse

# Load CSV
df = pd.read_csv("datasets/characters.csv")

# Encode password
password = urllib.parse.quote_plus("Aslam@2023")  # encode special characters

# Connect to PostgreSQL
engine = create_engine(f"postgresql+psycopg2://postgres:{password}@localhost:5432/Datasets")

# Insert into table
df.to_sql('characters', engine, if_exists='replace', index=False)
