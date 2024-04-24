def solution(data, ext, val_ext, sort_by):
    code = 0
    date = 1
    maximum = 2
    remain = 3
    
    if ext == "code":
        ext = 0
    elif ext == "date":
        ext = 1
    elif ext == "maximum":
        ext = 2
    else:
        ext = 3

    
    first = list(filter(lambda x : x[ext] < val_ext,data))
    
    if sort_by == "code":
        sort_by = 0
    elif sort_by == "date":
        sort_by = 1
    elif sort_by == "maximum":
        sort_by = 2
    else:
        sort_by = 3
        
    first.sort(key =lambda x : x[sort_by])
    
    
    return first