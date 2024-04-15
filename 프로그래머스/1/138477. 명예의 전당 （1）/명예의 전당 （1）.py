import heapq

def solution(k, score):
    heap = []
    answer = []
    for sc in score:
        if len(heap) < k:
            heapq.heappush(heap, sc)    
            answer.append(heap[0])
        else:
            heapq.heappush(heap,sc)
            heapq.heappop(heap)
            answer.append(heap[0])
    return answer