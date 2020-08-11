
cities = [
'New York', 'Los Angeles', 'Chicago',
'Huston', 'Phoenix', 'Philadelphia',
'San Antonio', 'San Diego', 'Dallas',
'San Jose', 'Austin', 'Jacksonville'
]

def split_in_n_lists(to_split, splits):
    splitpoint = round(len(cities)/splits)
    # all splitted lists in one big list:
    splitted_lists = []
    for i in range(splits):  # for every splitpoint
        splitted_lists.append(to_split[:splitpoint])
        del to_split[:splitpoint]  # del used items
    for splitted_list in splitted_lists:
        for i in range(len(to_split)):
            try:  # can get out of index
                splitted_list.append(to_split[i])
                del to_split[i]
            except:
                pass  # we don't need an execption
    return splitted_lists

split = split_in_n_lists(cities, 4)

for i in split:
    print(i)

# Output:
# ['New York', 'Los Angeles', 'Chicago']
# ['Huston', 'Phoenix', 'Philadelphia']
# ['San Antonio', 'San Diego', 'Dallas']
# ['San Jose', 'Austin', 'Jacksonville']
