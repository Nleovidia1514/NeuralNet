from _ast import Or


e = 2.718
LR = 2
input_neurons = ['l1', 'l2', 'l3', 'l4', 'l5']
neurons = ['l6','l7','l8','l9','l10','l11']
neurons_weights={
    'l1l6': 0.1561, 'l1l7': 0.1541, 'l1l8': 0.544, 'l1l9':0.1541, 'l1l10':0.1541,
    'l2l6': 0.1486, 'l2l7': 0.1454, 'l2l8': 0.152, 'l2l9':0.8778, 'l2l10':0.1541,
    'l3l6': 0.1165, 'l3l7': 0.8576, 'l3l8': 0.875, 'l3l9':0.6564, 'l3l10':0.1541,
    'l4l6': 0.154, 'l4l7': 0.8751, 'l4l8': 0.989, 'l4l9':0.5641, 'l4l10':0.1541,
    'l5l6': 0.156, 'l5l7': 0.5544, 'l5l8': 0.871, 'l5l9':0.2121, 'l5l10':0.1541,
    'l6l11': 0.1214,
    'l7l11': 0.1254,
    'l8l11': 0.7445,
    'l9l11': 0.8984,
    'l10l11': 0.5487,
    'b1l6': 1, 'b1l7': 1, 'b1l8': 1, 'b1l9':1, 'b1l10':1
    }
connected_neurons={
    'l6': input_neurons+['b1'],
    'l7': input_neurons+['b1'],
    'l8': input_neurons+['b1'],
    'l9': input_neurons+['b1'],
    'l10': input_neurons+['b1'],
    'l11': ['l6', 'l7', 'l8', 'l9', 'l10']
    }

outputs={
    'l1':1, 'l2':1, 'l3':1, 'l4':1, 'l5':1,
    'l6':1, 'l7':1, 'l8':1, 'l9':1, 'l10':1,
    'b1':1
    }

def sigmoid_function(x):
    output = 1/(1+(e**-(x)))
    return output
    
def neuron_output(x):
    output = sigmoid_function(x)
    return output;

def out(neuron):
    sumation = 0
    for connected in connected_neurons[neuron]:
        sumation +=  outputs[connected]*neurons_weights[connected+neuron]
    final_output = neuron_output(sumation)
    return final_output

def neural_net(dataset):
    for neuron in neurons:
        outie = out(neuron)
        output = outie
        outputs[neuron] = outie 
    return output

def compuerta1(a,b):
    x = 1
    if a==1 and b==1:
        x = 0
    return x
def compuerta2(a,b):
    x = 1
    if a==b:
        x = 0
    return x
def compuerta3o4(a,b):
    x = 0
    if a==1 and b==1:
        x = 1
    return x
def compuerta5(a):
    x = 1
    if a==1:
        x = 0
    return x
def compuerta6(a,b):
    x=1
    if a==0 and b==0:
        x = 0
    return x 
def compuerta7(a,b):
    x = 0
    if a==0 and b==0:
        x = 1
    return x

def circuito(dataset):
    x1 = compuerta1(dataset[0], dataset[1])
    x2 = compuerta2(dataset[1], dataset[2])
    x3 = compuerta3o4(x2, dataset[3])
    x4 = compuerta3o4(x1, x3)
    x5 = compuerta5(x3)
    x6 = compuerta6(x5, dataset[4])
    out = compuerta7(x4, x6)
    return out

def total_error(target, actual):
    error = (1/2)*((target-actual)**2)
    return error       

def partial_derivative_total_error(target, actual):
    return actual - target 
def partial_derivative_net_total(actual):
    return actual*(1-actual)
def partial_derivative_weight(h):
    derivative = out(h)   
    return derivative
def partial_derivative_error_weight(partial1, partial2, partial3):
    derivative = partial1*partial2*partial3
    return derivative
def partial_derivative_idontfuckingknow(neuron, partial1,partial2):
    for connected in connected_neurons[neuron]:
        derivative1 = (partial1*partial2)*neurons_weights[neuron+'l11']
        derivative2 = partial_derivative_net_total(out(neuron))
        derivative3 = out(neuron)
        totalDeriv = derivative1*derivative2*derivative3
        neurons_weights[connected+neuron] = neurons_weights[connected+neuron]-(LR*totalDeriv)
    
def backpropagation(target, actual):
    first_iter = ['l6','l7','l8','l9','l10']
    for neurons in first_iter:
        partial1 = partial_derivative_total_error(target, actual)
        partial2 = partial_derivative_net_total(actual)
        partial3 = partial_derivative_weight(neurons)
        resta = partial_derivative_error_weight(partial1, partial2, partial3)
        neurons_weights[neurons+'l11'] = neurons_weights[neurons+'l11']-(LR*resta)
        partial_derivative_idontfuckingknow(neurons, partial1, partial2)
    
 
def training():
    dataset = []
    for times in range(500):
        for a in range(2):
            for b in range(2):
                for c in range(2):
                    for d in range(2):
                        for e in range(2):
                            dataset = dataset+[a, b, c, d, e]
                            backpropagation(circuito(dataset), neural_net(dataset))
                            print(total_error(circuito(dataset), neural_net(dataset)))

training()
print(neurons_weights)
def corregimiento():
    keepRunning = True
    while keepRunning:
        dataset = []
        a = int(input('Insert A: '))
        while(a != 1 and a!= 0):
            a = input('Insert A: ')
        b = int(input('Insert B: '))
        while(b != 1 and b!= 0):
            b = input('Insert B: ')
        c = int(input('Insert C: '))
        while(c != 1 and c!= 0):
            c = input('Insert C: ') 
        d = int(input('Insert D: '))    
        while(d != 1 and d!= 0):
            d = input('Insert D: ')
        e = int(input('Insert E: '))
        while(e != 1 and e!= 0):
            e = input('Insert E: ')
        dataset = dataset + [a,b,c,d,e]
        print('The neural net result is {0} and the real result is {1}'.format(neural_net(dataset),circuito(dataset)))
        ask = input('Again? Y N')
        if ask == 'N':
            keepRunning = False
corregimiento()

    
            