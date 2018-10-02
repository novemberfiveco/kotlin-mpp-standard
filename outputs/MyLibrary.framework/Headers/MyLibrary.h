#import <Foundation/Foundation.h>

@class MyLibraryHelloWorld;

NS_ASSUME_NONNULL_BEGIN

@interface KotlinBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end;

@interface KotlinBase (KotlinBaseCopying) <NSCopying>
@end;

__attribute__((objc_runtime_name("KotlinMutableSet")))
@interface MyLibraryMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end;

__attribute__((objc_runtime_name("KotlinMutableDictionary")))
@interface MyLibraryMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end;

@interface NSError (NSErrorKotlinException)
@property (readonly) id _Nullable kotlinException;
@end;

__attribute__((objc_subclassing_restricted))
@interface MyLibraryHelloWorld : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)helloWorld __attribute__((swift_name("init()")));
- (NSString *)commonCode __attribute__((swift_name("commonCode()")));
@end;

@interface MyLibraryHelloWorld (Extensions)
- (NSString *)platformSpecificCode __attribute__((swift_name("platformSpecificCode()")));
@end;

NS_ASSUME_NONNULL_END
