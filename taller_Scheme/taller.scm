;funciones auxiliares
(define (append list1 list2)
        (if (null? list1) list2
            (cons (car list1) (append (cdr list1) list2))))

;punto 1
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


;punto 2
(define listica (list ))
(define (evaluar-puntos funcion lista)
  (cond ((> (length lista) 1)
    (append  (list (list (funcion (car lista)) (car lista))) listica )
    (evaluar-puntos funcion (cdr lista)))
    (else (append  (list(list (funcion (car lista)) (car lista))) listica ))
  )
) 
(evaluar-puntos cuadrado (list 1 2 3 4))


;punto 3
(define (es-creciente-en-punto? f x)
  (and (>=(f (+ x 1)) (f x)) (<=(f (- x 1)) (f x) ))
)
(es-creciente-en-punto? id 0 )
(es-creciente-en-punto? id 1 )
(es-creciente-en-punto? neg 1 )
(es-creciente-en-punto? cuadrado -5 )

;punto 4

(define (es-decreciente-en-punto? f x)
  (and (<=(f (+ x 1)) (f x)) (>=(f (- x 1)) (f x) ))
)
(es-decreciente-en-punto? cuadrado 1 )
(es-decreciente-en-punto? cuadrado 0 )
(es-decreciente-en-punto? cuadrado -5 )

;punto 5
(define (es-creciente-en-muestra? funcion lista)
  (cond ((> (length lista) 1) 
    (cond ((es-creciente-en-punto? funcion (car lista)) 
      (es-creciente-en-muestra? funcion (cdr lista)))
      (else #f )))
  (else (es-creciente-en-punto? funcion (car lista)))
  )
)
(es-creciente-en-muestra? id (list -5 -3 0 8) )
(es-creciente-en-muestra? neg (list -5 -3 0 8) )
(es-creciente-en-muestra? cuadrado (list -5 -3 0 8) )

(es-creciente-en-muestra? cuadrado (list 1 4 6) )

;punto 6
(define (es-decreciente-en-muestra? funcion lista)
  (cond ((> (length lista) 1) 
    (cond ((es-decreciente-en-punto? funcion (car lista)) 
      (es-decreciente-en-muestra? funcion (cdr lista)))
      (else #f )))
  (else (es-decreciente-en-punto? funcion (car lista)))
  )
)

(es-decreciente-en-muestra? id (list -5 -3 0 8) )
(es-decreciente-en-muestra? neg (list -5 -3 0 8) )
(es-decreciente-en-muestra? cuadrado (list -5 -3 0 8) )
(es-decreciente-en-muestra? neg (list -5 -3 0 1) )

;punto 7
(define (es-monotona? funcion lista )
  (or (es-creciente-en-muestra? funcion lista) (es-decreciente-en-muestra? funcion lista) )
)

(es-monotona? id (list -5 -3 0 8))
(es-monotona? neg (list -5 -3 0 8))
(es-monotona? cuadrado (list -5 -3 0 8))
(es-monotona? cuadrado (list -5 -3))
(es-monotona? cubo (list -5 -3 0 8))
