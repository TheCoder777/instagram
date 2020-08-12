import functools
import time

def timer(func):
    @functools.wraps(func)
    def wrapper_timer(*args, **kwargs):
        start_time = time.time()
        value = func(*args, **kwargs)
        run_time = time.time() - start_time
        print(f"'{func.__name__}' " \
        f"finished in {run_time:.3f}s")
        return value
    return wrapper_timer

@timer
def do_something(n):
    for i in range(n):
        sum([i**3 for i in range(1000)])

do_something(1000)

# Output:
# 'do_something' finished in 0.206s
