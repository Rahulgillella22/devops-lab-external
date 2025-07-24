from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def login_form():
    return '''
        <form action="/login" method="post">
            <input name="username"><br>
            <input name="password" type="password"><br>
            <input type="submit">
        </form>
    '''

@app.route('/login', methods=['POST'])
def login():
    if request.form['username'] == 'admin' and request.form['password'] == '123':
        return 'Login successful'
    else:
        return 'Login failed'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
