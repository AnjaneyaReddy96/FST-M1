import pandas
from pandas import ExcelWriter
 
# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Shwetha", "sravanthi", "pooja"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["Shwethah@ex.com", "sravanthi@ex.com", "pooja.rath@ex.com"],
	'PhoneNumber':["2623662221", "4567688856", "5678378338"]
}
 
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
output_file = "output.xlsx"
dataframe.to_excel(output_file, index=False)
print(f"Data successfully written to {output_file}")