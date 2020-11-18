(define and-l (lambda (x) 
    (if (null? x)
        #t
        (and (car x) (and-l (cdr x)) ))))

;funcion identidad f(x)=x
(define id
	(lambda (x) x)
)

;f(x)=-x
(define neg
	(lambda (x) (* x -1))
)

;f(x)=x*x
(define cuadrado
	(lambda (x) (* x x))
)

;f(x)=x*x*x
(define cubo
	(lambda (x) (* x x x))
)

(define valores(list -5 -1 0 10 15))

(define evaluar-puntos
  (lambda(x y) (x y) )
)

(define evaluar-puntos 3)
