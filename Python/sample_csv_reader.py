def my_csv_reader(file_name, delim=','):
    csv_file = open(file_name)
    data = []
    for row in csv_file:
        start, end = -1, -1
        words_list = []
        for index, char in enumerate(row):
            if char is delim:
                end = index
                words_list.append(row[start + 1: end])
                start = end
            elif start is end and index is len(row) - 1:
                words_list.append(row[end + 1:].strip())

        data.append(words_list)

    return data
